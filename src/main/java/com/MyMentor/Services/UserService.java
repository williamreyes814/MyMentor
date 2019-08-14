package com.MyMentor.Services;

import com.MyMentor.Repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

@Autowired
UserRepository userRepository;

    public User save(User user){

        return userRepository.save(user);
    }

    public User update(User user) {

        return userRepository.save(user);
    }

    public Iterable<User> findAll(){

        return userRepository.findAll();
    }




}
