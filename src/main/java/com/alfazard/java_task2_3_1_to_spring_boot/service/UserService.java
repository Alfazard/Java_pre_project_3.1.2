package com.alfazard.java_task2_3_1_to_spring_boot.service;


import com.alfazard.java_task2_3_1_to_spring_boot.model.User;

import java.util.List;

/**
 * @author Alfazard on 08.07.2023
 */
public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
