package com.shavi.movie.services;

import com.shavi.movie.converter.UserConvertor;
import com.shavi.movie.entities.User;
import com.shavi.movie.exceptions.UserExist;
import com.shavi.movie.repositories.UserRepository;
import com.shavi.movie.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(UserRequest userRequest) {
        if (userRepository.findByEmailId(userRequest.getEmailId()) != null) {
            throw new UserExist();
        }

        User user = UserConvertor.userDtoToUser(userRequest);

        userRepository.save(user);
        return "User Saved Successfully";
    }

}
