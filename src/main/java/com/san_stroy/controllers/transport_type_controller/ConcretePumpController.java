package com.san_stroy.controllers.transport_type_controller;

import com.san_stroy.dto.transport_type_dto.ConcretePumpDto;
import com.san_stroy.services.serviceImpl.ConcretePumpServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/concrete-pump")
@RequiredArgsConstructor
public class ConcretePumpController {

    private final ConcretePumpServiceImpl concretePumpService;
    
    @GetMapping
    public ResponseEntity<List<ConcretePumpDto>> getAllConcretePumps() {
        return ResponseEntity.ok(concretePumpService.findAllConcretePumps());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConcretePumpDto> getConcretePumpById(@PathVariable Long id) {
        return ResponseEntity.ok(concretePumpService.findConcretePumpById(id));
    }

    @PostMapping
    public ResponseEntity<ConcretePumpDto> createConcretePump(@Valid  @RequestBody ConcretePumpDto dto) {
        return ResponseEntity.ok(concretePumpService.addConcretePump(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ConcretePumpDto> updateConcretePump(@PathVariable Long id, @Valid @RequestBody ConcretePumpDto dto) {
        dto.setId(id);
        return ResponseEntity.ok(concretePumpService.updateConcretePump(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ConcretePumpDto> deleteConcretePump(@PathVariable Long id) {
        return ResponseEntity.ok(concretePumpService.deleteConcretePump(id));
    }
}
