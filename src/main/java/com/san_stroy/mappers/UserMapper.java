package com.san_stroy.mappers;

import com.san_stroy.dto.UserDto;
import com.san_stroy.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto userDto);


}
