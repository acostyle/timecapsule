package com.acostyle.timecapsule.service;

import com.acostyle.timecapsule.dto.UserDTO;
import com.acostyle.timecapsule.entity.User;

public interface UserService {
    User registerUser(UserDTO userDto);
    User findUserById(Long id);
    // Additional methods related to user operations
}
