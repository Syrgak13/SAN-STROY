package com.san_stroy.controllers;


import com.san_stroy.dto.AdvertisementDto;
import com.san_stroy.services.serviceImpl.AdvertisementServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/advertisement")
@RequiredArgsConstructor
@Valid
public class AdvertisementController {

    private final AdvertisementServiceImpl advertisementService;

    @GetMapping
    public List<AdvertisementDto> getAll() {
        return advertisementService
                .getAllAdvertisements();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdvertisementDto> getAdvertisementById(@PathVariable Long id) {
        return ResponseEntity
                .ok(advertisementService.getAdvertisementById(id));
    }

    @PostMapping
    public ResponseEntity<AdvertisementDto> addAdvertisement(@RequestBody @Valid AdvertisementDto advertisementDto) {
        AdvertisementDto addedAdvertisement = advertisementService.addAdvertisement(advertisementDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(addedAdvertisement);
    }

    @PutMapping
    public ResponseEntity<AdvertisementDto> updateAdvertisement(@PathVariable Long id, @RequestBody AdvertisementDto advertisementDto) {
        return ResponseEntity
                .ok(advertisementService.updateAdvertisement(id, advertisementDto));
    }

    @DeleteMapping
    public ResponseEntity<String> deleteAdvertisement(@PathVariable Long id) {
        advertisementService.deleteAdvertisement(id);
        return ResponseEntity.ok("Advertisement deleted successfully");
    }

}
