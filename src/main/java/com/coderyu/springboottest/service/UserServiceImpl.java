package com.coderyu.springboottest.service;

import com.coderyu.springboottest.mappers.UserMapper;
import com.coderyu.springboottest.model.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @SuppressWarnings({"SpringJavaInjectionPointsAutowiringInspection"})
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean isUserNameAndPasswordValid(String userName, String password) {
        if(StringUtils.isBlank(userName) || StringUtils.isBlank(password)){
            return false;
        }

        List<User> users=userMapper.findUserByName(userName);
        if(users!=null && !users.isEmpty()){
            User user=users.get(0);
            String hasedPassword=DigestUtils.md5Hex(password);
            return user.getPassword().equals(hasedPassword);
        }

        return false;
    }
}
