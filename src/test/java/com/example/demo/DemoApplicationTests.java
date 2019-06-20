package com.example.demo;

import com.example.demo.Service.UserService;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("com.example.demo.Mapper")
public class DemoApplicationTests {
    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        System.out.println(userService.QueryUser("黄宇阳").toString());
    }

}
