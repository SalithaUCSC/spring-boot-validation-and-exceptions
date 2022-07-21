package rest.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rest.entities.User;
import rest.services.UserService;

import java.util.Arrays;
import java.util.List;

@Component
public class UserDataExecutor implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) {
        userService.deleteAllUsers();
        List<User> users = Arrays.asList(
            User.builder().name("John").email("john@gmail.com").mobile("1234567890").age(28).build(),
            User.builder().name("Tom").email("tom@gmail.com").mobile("2224445678").age(34).build(),
            User.builder().name("Andrew").email("andrew@gmail.com").mobile("1112223330").age(22).build()
        );
        userService.saveAllUsers(users);
    }
}
