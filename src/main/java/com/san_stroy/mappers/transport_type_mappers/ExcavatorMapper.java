package com.san_stroy.mappers.transport_type_mappers;

import com.san_stroy.dto.transport_type_dto.ExcavatorDto;
import com.san_stroy.entities.transport_type.Excavator;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface ExcavatorMapper {

    ExcavatorDto toDto(Excavator excavator);
    Excavator toEntity(ExcavatorDto excavatorDto);

    @Mapping(target = "id", ignore = true)
    void updateExcavatorFromMapper(ExcavatorDto excavatorDto, @MappingTarget Excavator excavator);
}
