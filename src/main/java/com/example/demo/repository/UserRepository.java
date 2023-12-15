package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{


}



//@Query("select u from User u where u.dasId=:dasId")
//public User getNameByUsername(@Param("dasId")String dasId);

//public User getNameByUsername(String dasId,String password);