package com.san_stroy.mappers.transport_type_mappers;

import com.san_stroy.dto.transport_type_dto.DumpTruckDto;
import com.san_stroy.entities.transport_type.DumpTruck;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface DumpTruckMapper {

    DumpTruckDto toDto(DumpTruck dumpTruck);
    DumpTruck toEntity(DumpTruckDto dumpTruckDto);

    @Mapping(target = "id", ignore = true)
    void updateDumpTruckFromMapper(DumpTruckDto dumpTruckDto, @MappingTarget DumpTruck dumpTruck);
}
