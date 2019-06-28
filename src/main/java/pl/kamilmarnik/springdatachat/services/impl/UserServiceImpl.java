package pl.kamilmarnik.springdatachat.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kamilmarnik.springdatachat.domain.User;
import pl.kamilmarnik.springdatachat.repositories.UserRepository;
import pl.kamilmarnik.springdatachat.services.UserService;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User saveOrUpdateUser(User user) {
        userRepository.save(user);
        return user;
    }
}
