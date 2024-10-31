package uz.script.menu.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import uz.script.menu.entities.User;
import uz.script.menu.repositories.UserRepository;

@Service
@RequiredArgsConstructor
public class UserServiceImplement implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User create(User user) {

        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public UserDetailsService userDetailsService() {
        return null;
    }

    @Override
    public User getCurrentUser() {
        return null;
    }
}
