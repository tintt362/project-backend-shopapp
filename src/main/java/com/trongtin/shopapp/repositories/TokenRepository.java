package com.trongtin.shopapp.repositories;


import com.trongtin.shopapp.models.Role;
import com.trongtin.shopapp.models.Token;
import com.trongtin.shopapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TokenRepository extends JpaRepository<Token, Long> {
    List<Token> findByUser(User user);
    Token findByToken(String token);
    Token findByRefreshToken(String token);
}

