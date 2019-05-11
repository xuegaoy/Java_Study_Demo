package com.sarariman.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author http://www.sm1234.cn
 * @version 1.0
 * @description cn.sm1234.security
 * @date 18/4/13
 */
public class MyUserDetailService implements UserDetailsService {

    /**
     * loadUserByUsername: 读取用户信息
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //UserDetails: 封装用户数据的接口
        User user = new User( "eric","1234",
                AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));


        return user;
    }
}

