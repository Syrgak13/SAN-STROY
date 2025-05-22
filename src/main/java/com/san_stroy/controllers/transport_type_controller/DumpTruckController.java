package com.san_stroy.controllers.transport_type_controller;

import com.san_stroy.dto.transport_type_dto.DumpTruckDto;
import com.san_stroy.services.serviceImpl.DumpTruckServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dump-truck")
@RequiredArgsConstructor
public class DumpTruckController {
    
    private final DumpTruckServiceImpl dumpTruckService;

    @GetMapping
    public ResponseEntity<List<DumpTruckDto>> getAllDumpTrucks() {
        return ResponseEntity.ok(dumpTruckService.findDumpTrucks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DumpTruckDto> getDumpTruckById(@PathVariable Long id) {
        return ResponseEntity.ok(dumpTruckService.findDumpTruckById(id));
    }

    @PostMapping
    public ResponseEntity<DumpTruckDto> createDumpTruck(@RequestBody DumpTruckDto dto) {
        return ResponseEntity.ok(dumpTruckService.addDumpTruck(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DumpTruckDto> updateDumpTruck(@PathVariable Long id, @RequestBody DumpTruckDto dto) {
        dto.setId(id);
        return ResponseEntity.ok(dumpTruckService.updateDumpTruck(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DumpTruckDto> deleteDumpTruck(@PathVariable Long id) {
        return ResponseEntity.ok(dumpTruckService.deleteDumpTruck(id));
    }
}
