package com.san_stroy.mappers;

import com.san_stroy.dto.AdvertisementDto;
import com.san_stroy.entities.Advertisement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface AdvertisementMapper {
    AdvertisementDto toDto(Advertisement advertisement);
    Advertisement toEntity(AdvertisementDto advertisementDto);
}
