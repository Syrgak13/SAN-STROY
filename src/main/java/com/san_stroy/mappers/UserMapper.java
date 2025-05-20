package com.san_stroy.mappers;

import com.san_stroy.dto.UserDto;
import com.san_stroy.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")

public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto userDto);

    @Mapping(target = "id", ignore = true)
    void updateUserFromMapper(UserDto userDto, @MappingTarget User user);
}
