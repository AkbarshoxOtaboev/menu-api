package uz.script.menu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.script.menu.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    boolean existsByUsername(String username);

}
