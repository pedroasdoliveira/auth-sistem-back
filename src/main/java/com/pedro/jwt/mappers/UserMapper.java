package com.pedro.jwt.mappers;

import com.pedro.jwt.dto.SignUpDto;
import com.pedro.jwt.dto.UserDto;
import com.pedro.jwt.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);
}
