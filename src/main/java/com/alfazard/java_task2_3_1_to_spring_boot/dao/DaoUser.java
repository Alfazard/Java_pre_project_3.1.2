package com.alfazard.java_task2_3_1_to_spring_boot.dao;


import com.alfazard.java_task2_3_1_to_spring_boot.model.User;

import java.util.List;

/**
 * @author Alfazard on 08.07.2023
 */
public interface DaoUser {
    List<User> getAllUsers();
    void addUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
