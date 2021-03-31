package com.grocery.user.repository;

import com.grocery.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

    User findUserByUsername(String userName);

    @Override
    List<User> findAll();
}
