package pl.kamilmarnik.springdatachat.services;

import pl.kamilmarnik.springdatachat.domain.User;

public interface UserService {
    User saveOrUpdateUser(User user);
}
