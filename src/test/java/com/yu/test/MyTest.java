package com.yu.test;

import com.yu.EasyPOIApplication;
import com.yu.dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = EasyPOIApplication.class)
public class MyTest {
    @Autowired
    UserMapper userMapper;
    @Test
    public void tesMapper(){
        System.out.println(userMapper.findAll());
    }
}