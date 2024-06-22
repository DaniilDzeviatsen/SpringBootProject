package com.example.springprojectboot.dao;



import com.example.springprojectboot.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User getUser(Long id);

}
