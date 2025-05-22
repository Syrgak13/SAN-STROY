package com.san_stroy.services.serviceImpl;

import com.san_stroy.dto.UserDto;
import com.san_stroy.entities.User;
import com.san_stroy.mappers.UserMapper;
import com.san_stroy.repositories.UserRepository;
import com.san_stroy.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<UserDto> findAllUsers() {
        return userRepository
                .findAll()
                .stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto findUserById(Long id) {
        User user = userRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("User with id: " + id + " not found."));
        return userMapper.toDto(user);
    }

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    public UserDto addUser(UserDto userDto) {
        User newUser = userMapper.toEntity(userDto);
        User savedUser = userRepository.save(newUser);
        return userMapper.toDto(savedUser);
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDto) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User with id: " + id + " not found."));
        userMapper.updateUserFromMapper(userDto, existingUser);
        User updated = userRepository.save(existingUser);
        return userMapper.toDto(updated);
    }

    @Override
    public UserDto deleteUser(Long id) {
        User deletedUser = userRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("User with id: " + id + " not found."));

        userRepository.delete(deletedUser);
        return userMapper.toDto(deletedUser);
    }

    @Override
    public UserDto findUserByEmail(String email) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User with email: " + email + " not found."));
        return userMapper.toDto(user);
    }

    @Override
    public UserDto updateUserByEmail(String email, UserDto userDto) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User with email: " + email + " not found."));

        userMapper.updateUserFromMapper(userDto, user);
        User updatedUser = userRepository.save(user);
        return userMapper.toDto(updatedUser);
    }

    @Override
    public void deleteUserByEmail(String email) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User with email: " + email + " not found."));

        userRepository.delete(user);
    }
}
