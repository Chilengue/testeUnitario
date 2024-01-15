package api.api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import api.api.domain.User;
import api.api.repositories.UserRepository;
import api.api.service.UserService;

public class userServiceImpl implements UserService{

   

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer Id) {
        Optional<User> obj=repository.findById(Id);
        return obj.orElse(null);
    }
    
}
