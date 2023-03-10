package com.switchfully.programming.advanced.bdd;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.assertj.core.util.Lists.newArrayList;

@Component
public class UserClient {

    private RestTemplate restTemplate = new RestTemplate();

    public List<User> getAllUsers() {
        return newArrayList(restTemplate.getForObject("http://localhost:8080/users", User[].class));
    }

    public void addPerson(User user) {
        restTemplate.postForObject("http://localhost:8080/users", user, Void.class);
    }
}
