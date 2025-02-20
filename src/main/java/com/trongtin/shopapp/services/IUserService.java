package com.trongtin.shopapp.services;


import com.trongtin.shopapp.dtos.UpdateUserDTO;
import com.trongtin.shopapp.dtos.UserDTO;
import com.trongtin.shopapp.models.User;

public interface IUserService {
    User createUser(UserDTO userDTO) throws Exception;
    String login(String phoneNumber, String password, Long roleId) throws Exception;
    User getUserDetailsFromToken(String token) throws Exception;
    User updateUser(Long userId, UpdateUserDTO updatedUserDTO) throws Exception;
}
