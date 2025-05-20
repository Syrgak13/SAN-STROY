package com.san_stroy.services;

import com.san_stroy.dto.AdvertisementDto;

import java.util.List;

public interface AdvertisementService {

    List<AdvertisementDto> getAllAdvertisement();

    AdvertisementDto getAdvertisementById(Long id);

    AdvertisementDto addAdvertisement(AdvertisementDto advertisementDto);

    AdvertisementDto updateAdvertisement(Long id, AdvertisementDto advertisementDto);

    AdvertisementDto deleteAdvertisement(Long id);
}
