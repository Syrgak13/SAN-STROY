package com.san_stroy.mappers;

import com.san_stroy.dto.AdvertisementDto;
import com.san_stroy.entities.Advertisement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")

public interface AdvertisementMapper {
    AdvertisementDto toDto(Advertisement advertisement);
    Advertisement toEntity(AdvertisementDto advertisementDto);

    @Mapping(target = "id", ignore = true)
    void updateAdvertisementFromMapper(AdvertisementDto advertisementDto, @MappingTarget Advertisement advertisement);
}
