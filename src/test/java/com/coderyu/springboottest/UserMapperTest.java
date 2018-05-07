package com.coderyu.springboottest;

import com.coderyu.springboottest.mappers.UserMapper;
import com.coderyu.springboottest.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @SuppressWarnings({"SpringJavaInjectionPointsAutowiringInspection"})
    @Autowired
    private UserMapper userMapper;

    @Test
    public void createTest(){
        User user=new User("Tom","123456",new Date(),Boolean.valueOf("True"));
        Integer newUserId= userMapper.insertUser(user);
        assertTrue(newUserId>0);
    }

    @Test
    public void findAllUsers(){
        List<User> users= userMapper.findAllUsers();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }
}
