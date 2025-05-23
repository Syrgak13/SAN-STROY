package com.san_stroy.mappers.transport_type_mappers;

import com.san_stroy.dto.transport_type_dto.ConcreteMixerDto;
import com.san_stroy.entities.transport_type.ConcreteMixer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ConcreteMixerMapper {

    ConcreteMixerDto toDto(ConcreteMixer concreteMixer);
    ConcreteMixer toEntity(ConcreteMixerDto concreteMixerDto);

    @Mapping(target = "id", ignore = true)
    void updateConcreteMixerFromMapper(ConcreteMixerDto concreteMixerDto, @MappingTarget ConcreteMixer concreteMixer);
}
