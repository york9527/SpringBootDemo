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

    //密码123456
    private static final String DEFAULT_PASSWORD="$2a$10$lMLyvSszbgP.GPwJLqXdZ.kXoGuSv7hY1fFw5h00enUhuNFoC2ubq";

    @Test
    public void createTest(){
        User user=new User("Tom",DEFAULT_PASSWORD,new Date(),Boolean.valueOf("True"));
        Integer newUserId= userMapper.insertUser(user);
        assertTrue(newUserId>0);
    }

    @Test
    public void findUserById(){
        User user=userMapper.findUserById(1);
        assertNotNull(user);
    }

    @Test
    public void findUserByName(){
        User user=new User("Jhon",DEFAULT_PASSWORD,new Date(),Boolean.valueOf("True"));
        userMapper.insertUser(user);
        List<User> users=userMapper.findUserByName(user.getName());
        assertNotNull(users);
        assertTrue(!users.isEmpty());
        assertTrue(user.getName().equals(users.get(0).getName()));
    }

    @Test
    public void findAllUsers(){
        List<User> users= userMapper.findAllUsers();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }

    @Test
    public void findUserWithRolesByName(){
        List<User> users=userMapper.findUserWithRolesByName("admin");
        assertNotNull(users);
        assertTrue(users.get(0).getRoles().size()>0);
    }
}
