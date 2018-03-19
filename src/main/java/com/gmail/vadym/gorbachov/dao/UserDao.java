package com.gmail.vadym.gorbachov.dao;

import com.gmail.vadym.gorbachov.entity.User;

import java.util.Collection;

public interface UserDao {
    Collection<User> getAllUsers();

    User getUserById(int id);

    void removeUserById(int id);

    void updateUser(User user);

    void insertUserToDb(User user);
}
