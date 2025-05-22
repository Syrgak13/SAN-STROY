package com.san_stroy.mappers.transport_type_mappers;

import com.san_stroy.dto.transport_type_dto.CraneDto;
import com.san_stroy.entities.transport_type.Crane;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CraneMapper {

    CraneDto toDto(Crane crane);
    Crane toEntity(CraneDto craneDto);

    @Mapping(target = "id", ignore = true)
    void updateCraneFromMapper(CraneDto craneDto, @MappingTarget Crane crane);
}
