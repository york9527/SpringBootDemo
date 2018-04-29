package com.coderyu.springboottest;


import com.coderyu.springboottest.dao.UserRepository;
import com.coderyu.springboottest.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootTestApplication.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findAllUsers(){
        List<User> users=userRepository.findAll();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }

    @Test
    public void findUserById(){
        User user=userRepository.findUserbyId(1);
        assertNotNull(user);
        assertEquals("张三",user.getName());
    }

    @Test
    public void createTest(){
        User user=new User(null,"tom","abc@gmail.com");
        User savedUser=userRepository.create(user);
        User newUser=userRepository.findUserbyId(savedUser.getId());
        assertEquals("tom",newUser.getName());
        assertEquals("abc@gmail.com",newUser.getEmail());
    }

}
