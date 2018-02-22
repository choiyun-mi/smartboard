package com.anyang.study.service;

import com.anyang.study.respository.UserRepository;
import com.anyang.study.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private User user;
    private UserRepository userRepository;

    public UserServiceImpl() {
    }

    public addUser(User user){
        return userRepository.save(user);
    }
}
