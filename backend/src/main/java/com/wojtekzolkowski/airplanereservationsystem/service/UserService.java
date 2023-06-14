package com.wojtekzolkowski.airplanereservationsystem.service;

import com.wojtekzolkowski.airplanereservationsystem.dao.UserDao;
import com.wojtekzolkowski.airplanereservationsystem.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService

{

    private final UserDao userDao;

    public UserService(UserDao userDao)
    {
        this.userDao = userDao;
    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
//    {
//        User user = userDao.findByUsername(username);
//        if(user == null){
//            throw new UsernameNotFoundException("User not found");
//        }
//        return new U;
//    }
}
