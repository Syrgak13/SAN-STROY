package com.san_stroy.mappers;

import com.san_stroy.dto.TransportDto;
import com.san_stroy.dto.UserDto;
import com.san_stroy.entities.Transport;
import com.san_stroy.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper

public interface TransportMapper {
    TransportDto toDto(Transport transport);
    Transport toEntity(TransportDto transportDto);

    @Mapping(target = "id", ignore = true)
    void updateTransportFromMapper(TransportDto transportDto, @MappingTarget Transport transport);
}
