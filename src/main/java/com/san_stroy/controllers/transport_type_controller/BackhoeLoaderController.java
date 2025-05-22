package com.san_stroy.controllers.transport_type_controller;

import com.san_stroy.dto.transport_type_dto.BackhoeLoaderDto;
import com.san_stroy.services.serviceImpl.BackhoeLoaderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/backhoe-loaders")
@RequiredArgsConstructor
public class BackhoeLoaderController {

    private final BackhoeLoaderServiceImpl backhoeLoaderService;

    @GetMapping
    public ResponseEntity<List<BackhoeLoaderDto>> getAllBackhoeLoaders() {
        return ResponseEntity.ok(backhoeLoaderService.findAllBackhoeLoaders());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BackhoeLoaderDto> getBackhoeLoaderById(@PathVariable Long id) {
        return ResponseEntity.ok(backhoeLoaderService.findBackhoeLoaderById(id));
    }

    @PostMapping
    public ResponseEntity<BackhoeLoaderDto> createBackhoeLoader(@RequestBody BackhoeLoaderDto dto) {
        return ResponseEntity.ok(backhoeLoaderService.addBackhoeLoader(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BackhoeLoaderDto> updateBackhoeLoader(@PathVariable Long id, @RequestBody BackhoeLoaderDto dto) {
        dto.setId(id);
        return ResponseEntity.ok(backhoeLoaderService.updateBackhoeLoader(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BackhoeLoaderDto> deleteBackhoeLoader(@PathVariable Long id) {
        return ResponseEntity.ok(backhoeLoaderService.deleteBackhoeLoader(id));
    }
}
