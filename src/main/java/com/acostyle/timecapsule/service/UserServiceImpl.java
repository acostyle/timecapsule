package com.acostyle.timecapsule.service;

import com.acostyle.timecapsule.dto.UserDTO;
import com.acostyle.timecapsule.entity.User;
import com.acostyle.timecapsule.exception.UserNotFoundException;
import com.acostyle.timecapsule.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(UserDTO userDto) {
        String username = userDto.getUsername();
        String email = userDto.getEmail();
        String password = userDto.getPassword();

        User user = User.builder()
                .username(username)
                .email(email)
                .password(password)
                .build();

        return userRepository.save(user);
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
    }

}
