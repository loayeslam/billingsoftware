package com.retailstore.billingsoftware.service;

import com.retailstore.billingsoftware.io.UserRequest;
import com.retailstore.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse createdUser(UserRequest Request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
