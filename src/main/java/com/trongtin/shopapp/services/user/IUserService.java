package com.trongtin.shopapp.services.user;


import com.trongtin.shopapp.dtos.UpdateUserDTO;
import com.trongtin.shopapp.dtos.UserDTO;
import com.trongtin.shopapp.exceptions.DataNotFoundException;
import com.trongtin.shopapp.exceptions.InvalidPasswordException;
import com.trongtin.shopapp.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {
    User createUser(UserDTO userDTO) throws Exception;
    String login(String phoneNumber, String password, Long roleId) throws Exception;
    User getUserDetailsFromToken(String token) throws Exception;
    User updateUser(Long userId, UpdateUserDTO updatedUserDTO) throws Exception;
    Page<User> findAll(String keyword, Pageable pageable) throws Exception;

    User getUserDetailsFromRefreshToken(String refreshToken) throws Exception;

    void resetPassword(Long userId, String newPassword)
            throws InvalidPasswordException, DataNotFoundException;
    public void blockOrEnable(Long userId, Boolean active) throws DataNotFoundException;
}
