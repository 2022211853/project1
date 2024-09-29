package com.example.project1;

import com.example.project1.mapper.UserMapper;
import com.example.project1.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Project1ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testListUser(){
        List<User> userList=userMapper.list();
        userList.stream().forEach(user->{System.out.println(user);
        });
    }

}
