package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.AdvertisementDto;
import com.san_stroy.entities.Advertisement;
import com.san_stroy.mappers.AdvertisementMapper;
import com.san_stroy.mappers.TransportMapper;
import com.san_stroy.repositories.AdvertisementRepository;
import com.san_stroy.repositories.TransportRepository;
import com.san_stroy.services.AdvertisementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdvertisementServiceImpl implements AdvertisementService {

    private final AdvertisementMapper advertisementMapper;
    private final AdvertisementRepository advertisementRepository;
    private final TransportRepository transportRepository;
    private final TransportMapper transportMapper;

    @Override
    public List<AdvertisementDto> getAllAdvertisements() {
        return advertisementRepository
                .findAll()
                .stream()
                .map(advertisementMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public AdvertisementDto getAdvertisementById(Long id) {
        Advertisement advertisement = advertisementRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Advertisement not found"));
        return advertisementMapper.toDto(advertisement);
    }

    @Override
    public AdvertisementDto addAdvertisement(AdvertisementDto advertisementDto) {
        Advertisement newAdvertisement = advertisementMapper.toEntity(advertisementDto);
        Advertisement savedAdvertisement = advertisementRepository.save(newAdvertisement);
        return advertisementMapper.toDto(savedAdvertisement);
    }

    @Override
    public AdvertisementDto updateAdvertisement(Long id, AdvertisementDto advertisementDto) {
        Advertisement existingAdvertisement = advertisementRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Advertisement not found"));

        advertisementMapper.updateAdvertisementFromMapper(advertisementDto, existingAdvertisement);

        Advertisement updatedAdvertisement = advertisementRepository.save(existingAdvertisement);
        return advertisementMapper.toDto(updatedAdvertisement);
    }

    @Override
    public AdvertisementDto deleteAdvertisement(Long id) {
        Advertisement deletedAdvertisement = advertisementRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Advertisement not found"));

        advertisementRepository.delete(deletedAdvertisement);
        return advertisementMapper.toDto(deletedAdvertisement);
    }
}
