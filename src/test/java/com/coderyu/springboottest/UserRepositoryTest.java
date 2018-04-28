package com.coderyu.springboottest;


import com.coderyu.springboottest.dao.UserRepository;
import com.coderyu.springboottest.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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

}
