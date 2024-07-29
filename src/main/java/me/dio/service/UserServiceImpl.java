package me.dio.service;

import me.dio.domain.model.User;
import org.springframework.stereotype.Service;

import me.dio.domain.repository.*;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements  UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {

        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
/*
        if(userToCreate.getId() !=null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This User ID already exits");
        }

 */
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
