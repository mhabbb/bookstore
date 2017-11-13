package pl.mh.bookstore.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import pl.mh.bookstore.domain.User;
import pl.mh.bookstore.domain.UserDto;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);
    User save(UserDto userDto);
    User findByLogin(String login);
}