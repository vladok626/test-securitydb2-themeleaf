package ru.urfu.testsecuritydb2themeleaf.service;


import ru.urfu.testsecuritydb2themeleaf.dto.UserDto;
import ru.urfu.testsecuritydb2themeleaf.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
