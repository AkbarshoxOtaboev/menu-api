package uz.script.menu.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import uz.script.menu.entities.User;

public interface UserService {
    User  save(User user);
    User create(User user);
    User getByUsername(String username);
    UserDetailsService userDetailsService();
    User getCurrentUser();
}
