package com.san_stroy.controllers.transport_type_controller;

import com.san_stroy.dto.transport_type_dto.ConcreteMixerDto;
import com.san_stroy.services.serviceImpl.ConcreteMixerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/concrete-mixer")
@RequiredArgsConstructor
public class ConcreteMixerController {

    private final ConcreteMixerServiceImpl concreteMixerService;


    @GetMapping
    public ResponseEntity<List<ConcreteMixerDto>> getAllConcreteMixers() {
        return ResponseEntity.ok(concreteMixerService.findAllConcreteMixers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConcreteMixerDto> getConcreteMixerById(@PathVariable Long id) {
        return ResponseEntity.ok(concreteMixerService.findConcreteMixerById(id));
    }

    @PostMapping
    public ResponseEntity<ConcreteMixerDto> createConcreteMixer(@RequestBody ConcreteMixerDto dto) {
        return ResponseEntity.ok(concreteMixerService.addConcreteMixer(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ConcreteMixerDto> updateConcreteMixer(@PathVariable Long id, @RequestBody ConcreteMixerDto dto) {
        dto.setId(id);
        return ResponseEntity.ok(concreteMixerService.updateConcreteMixer(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ConcreteMixerDto> deleteConcreteMixer(@PathVariable Long id) {
        return ResponseEntity.ok(concreteMixerService.deleteConcreteMixer(id));
    }
}
