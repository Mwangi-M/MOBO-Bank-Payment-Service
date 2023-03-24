package com.example.moboBank.model;

import java.util.List;

public interface UserService {

    List<model.User> getAllUsers();

    model.User getUserById(Long id);

    model.User createUser(model.User user);

    model.User updateUser(Long id, model.User userDetails);

    void deleteUser(Long id);
}


