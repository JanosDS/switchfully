package com.switchfully.programming.advanced.bdd;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> userList = new ArrayList<>();

    @GetMapping
    public List<User> getAllPersons() {
        return userList;
    }

    @PostMapping
    public void createPerson(@RequestBody User user) {
        userList.add(user);
    }
}
