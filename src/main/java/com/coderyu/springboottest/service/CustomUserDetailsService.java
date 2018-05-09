package com.coderyu.springboottest.service;

import com.coderyu.springboottest.mappers.UserMapper;
import com.coderyu.springboottest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        List<User> users=userMapper.findUserByName(userName);
        if(users==null || !users.isEmpty()){
            throw new UsernameNotFoundException("用户名"+userName+"不存在");
        }

        User user=users.get(0);

        return new org.springframework.security.core.userdetails.User(
                user.getName(),
                user.getPassword(),
                getAuthorities(user)
        );
    }

    private static Collection<? extends GrantedAuthority> getAuthorities(User user){
        return AuthorityUtils.createAuthorityList("buyer_assistant","sales_manager");
    }
}
