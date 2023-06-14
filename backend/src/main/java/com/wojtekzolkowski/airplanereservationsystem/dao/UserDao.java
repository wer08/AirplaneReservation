package com.wojtekzolkowski.airplanereservationsystem.dao;

import com.wojtekzolkowski.airplanereservationsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User,Long>
{
    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);
}
