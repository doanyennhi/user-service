package com.team4.user_service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id){
        return userRepository.findUserById(id);
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAllDoctors(){
        return userRepository.findUsersByRoleEquals("DOCTOR");
    }

    public List<User> findAll() {return userRepository.findAll();}

}
