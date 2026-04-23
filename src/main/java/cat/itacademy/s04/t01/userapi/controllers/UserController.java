package cat.itacademy.s04.t01.userapi.controllers;

import cat.itacademy.s04.t01.userapi.model.User;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping ("/users")
public class UserController {

    private static final List<User> users = new CopyOnWriteArrayList<>();

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    @PostMapping
    public User createUser (@RequestBody User user) {
        user.setId(UUID.randomUUID());
        users.add(user);
        return user;
    }

}
