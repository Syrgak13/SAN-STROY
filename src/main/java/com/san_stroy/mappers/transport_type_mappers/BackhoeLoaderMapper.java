package com.san_stroy.mappers.transport_type_mappers;

import com.san_stroy.dto.transport_type_dto.BackhoeLoaderDto;
import com.san_stroy.entities.transport_type.BackhoeLoader;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BackhoeLoaderMapper {

    BackhoeLoaderDto toDto(BackhoeLoader backhoeLoader);
    BackhoeLoader toEntity(BackhoeLoaderDto backhoeLoaderDto);

    @Mapping(target = "id", ignore = true)
    void updateBackhoeLoaderFromMapper(BackhoeLoaderDto backhoeLoaderDto, @MappingTarget BackhoeLoader backhoeLoader);

}
