package com.san_stroy.services;

import com.san_stroy.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findAllUsers();

    UserDto findUserById(Long id);

    UserDto addUser(UserDto userDto);

    UserDto updateUser(Long id, UserDto userDto);

    UserDto deleteUser(Long id);
}
