package com.ecommerce.userservice.service;

import com.ecommerce.userservice.dto.LoginDTO;
import com.ecommerce.userservice.dto.RegisterationDTO;
import com.ecommerce.userservice.dto.UserDTO;
import com.ecommerce.userservice.exception.AppException;

public interface AuthService {

    UserDTO login(LoginDTO request) throws AppException;

    UserDTO register(RegisterationDTO request) throws AppException;
}
