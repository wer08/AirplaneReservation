package com.wojtekzolkowski.airplanereservationsystem.service;

import com.wojtekzolkowski.airplanereservationsystem.dao.UserDao;
import com.wojtekzolkowski.airplanereservationsystem.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService
{

    private final UserDao userDao;

    @Override
    public User loadUserByUsername(String username)
    {
        return userDao.findByUsername(username).orElseThrow(()->new UsernameNotFoundException(("user not found")));
    }

}
