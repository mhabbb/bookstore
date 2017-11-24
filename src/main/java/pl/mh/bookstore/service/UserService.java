package pl.mh.bookstore.service;

import pl.mh.bookstore.domain.User;
import pl.mh.bookstore.domain.UserDto;

import java.util.Collection;

public interface UserService {
    User save(UserDto userDto);
    Collection<User> findAllUsers();
    User findByLogin(String login);
    User findByEmail(String email);
    void deleteUser(User user);
}
