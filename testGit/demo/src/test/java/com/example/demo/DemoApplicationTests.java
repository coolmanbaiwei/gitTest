package com.example.demo;

import com.example.demo.domin.User;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println("hello Word!!");
        System.out.println("fuck");
    }

    @Test
    void test1() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users.toString());
    }

}
