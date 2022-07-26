package com.example.amelaproject.serviceTest;

import com.example.amelaproject.entity.UserEntity;
import com.example.amelaproject.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    void addUser() {
        UserEntity user = new UserEntity (1L, "vietnq", "viet", "12345");
        userService.AddUser(user);
        assertEquals(1L,user.getLoginID());
    }

}
