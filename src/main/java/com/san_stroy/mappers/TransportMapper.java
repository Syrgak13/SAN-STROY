package com.san_stroy.mappers;

import com.san_stroy.dto.TransportDto;
import com.san_stroy.dto.UserDto;
import com.san_stroy.entities.Transport;
import com.san_stroy.entities.User;
import org.mapstruct.Mapper;

@Mapper

public interface TransportMapper {
    TransportDto toDto(Transport transport);
    Transport toEntity(TransportDto transportDto);
}
