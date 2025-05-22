package com.san_stroy.controllers.transport_type_controller;

import com.san_stroy.dto.transport_type_dto.CraneDto;
import com.san_stroy.services.serviceImpl.CraneServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crane")
@RequiredArgsConstructor
public class CraneController {

    private final CraneServiceImpl craneService;

    @GetMapping
    public ResponseEntity<List<CraneDto>> getAllCranes() {
        return ResponseEntity.ok(craneService.findAllCranes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CraneDto> getCraneById(@PathVariable Long id) {
        return ResponseEntity.ok(craneService.findCraneById(id));
    }

    @PostMapping
    public ResponseEntity<CraneDto> createCrane(@RequestBody CraneDto dto) {
        return ResponseEntity.ok(craneService.addCrane(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CraneDto> updateCrane(@PathVariable Long id, @RequestBody CraneDto dto) {
        dto.setId(id);
        return ResponseEntity.ok(craneService.updateCrane(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CraneDto> deleteCrane(@PathVariable Long id) {
        return ResponseEntity.ok(craneService.deleteCrane(id));
    }
}
