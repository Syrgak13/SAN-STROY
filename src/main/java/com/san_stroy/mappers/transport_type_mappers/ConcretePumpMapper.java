package com.san_stroy.mappers.transport_type_mappers;

import com.san_stroy.dto.transport_type_dto.ConcretePumpDto;
import com.san_stroy.entities.transport_type.ConcretePump;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ConcretePumpMapper {

    ConcretePumpDto toDto(ConcretePump concretePump);
    ConcretePump toEntity(ConcretePumpDto concretePumpDto);

    @Mapping(target = "id", ignore = true)
    void updateConcretePumpFromMapper(ConcretePumpDto concretePumpDto, @MappingTarget ConcretePump concretePump);
}
