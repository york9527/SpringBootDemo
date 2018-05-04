package com.coderyu.springboottest;

import com.coderyu.springboottest.mappers.UserMapper;
import com.coderyu.springboottest.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest  {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAllUsers(){
        List<User> users= userMapper.findAllUsers();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }

    @Test
    public void findUserById(){
        User user= userMapper.findUserById(1);
        assertNotNull(user);
        assertEquals("张三",user.getName());
    }

    @Test
    public void createTest(){
//        User user=new User(null,"tom","abc@gmail.com");
//        User savedUser= userMapper.insertUser(user);
//        User newUser= userMapper.findUserById(savedUser.getId());
//        assertEquals("tom",newUser.getName());
//        assertEquals("abc@gmail.com",newUser.getEmail());
    }
}
