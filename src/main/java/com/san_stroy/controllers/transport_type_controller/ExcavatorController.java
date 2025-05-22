package com.san_stroy.controllers.transport_type_controller;


import com.san_stroy.dto.transport_type_dto.ExcavatorDto;
import com.san_stroy.services.serviceImpl.ExcavatorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/excavator")
@RequiredArgsConstructor
public class ExcavatorController {
    
    private final ExcavatorServiceImpl excavatorService;

    @GetMapping
    public ResponseEntity<List<ExcavatorDto>> getAllExcavators() {
        return ResponseEntity.ok(excavatorService.findAllExcavators());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExcavatorDto> getExcavatorById(@PathVariable Long id) {
        return ResponseEntity.ok(excavatorService.findExcavatorById(id));
    }

    @PostMapping
    public ResponseEntity<ExcavatorDto> createExcavator(@RequestBody ExcavatorDto dto) {
        return ResponseEntity.ok(excavatorService.addExcavator(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExcavatorDto> updateExcavator(@PathVariable Long id, @RequestBody ExcavatorDto dto) {
        dto.setId(id);
        return ResponseEntity.ok(excavatorService.updateExcavator(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ExcavatorDto> deleteExcavator(@PathVariable Long id) {
        return ResponseEntity.ok(excavatorService.deleteExcavator(id));
    }
}
