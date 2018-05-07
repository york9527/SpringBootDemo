package com.coderyu.springboottest.mappers;

import com.coderyu.springboottest.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    Integer insertUser(User user);
    User findUserById(Integer id);
    List<User> findUserByName(String name);
    List<User> findAllUsers();
}
