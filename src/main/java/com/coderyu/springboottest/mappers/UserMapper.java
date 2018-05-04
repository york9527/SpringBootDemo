package com.coderyu.springboottest.mappers;

import com.coderyu.springboottest.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Insert("insert into users(name,email) values(#{name},#{email})")
    @SelectKey(statement = "call identity()", keyProperty = "id",
            before = false, resultType = Integer.class)
    User insertUser(User user);

    @Select("select id, name, email from users WHERE id=#{id}")
    User findUserById(Integer id);

    @Select("select id, name, email from users")
    List<User> findAllUsers();
}
