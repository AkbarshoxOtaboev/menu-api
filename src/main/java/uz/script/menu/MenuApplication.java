package uz.script.menu;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import uz.script.menu.entities.Role;
import uz.script.menu.entities.User;
import uz.script.menu.repositories.UserRepository;
import uz.script.menu.services.UserService;

@SpringBootApplication
@RequiredArgsConstructor
public class MenuApplication {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(UserService userService) {
        if(!userRepository.existsByUsername("akbar")){
            return args -> {
                User user =  User.builder()
                        .fullName("Akbar Otaboev")
                        .username("akbar")
                        .password(passwordEncoder.encode("12345678"))
                        .role(Role.ROLE_ADMIN)
                        .build();
                userService.create(user);
            };
        }else{
            return args -> {};
        }

    }

}
