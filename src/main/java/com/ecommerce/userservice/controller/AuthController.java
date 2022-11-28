package com.ecommerce.userservice.controller;

import com.ecommerce.userservice.dto.LoginDTO;
import com.ecommerce.userservice.dto.RegisterationDTO;
import com.ecommerce.userservice.dto.UserDTO;
import com.ecommerce.userservice.exception.AppException;
import com.ecommerce.userservice.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping(value = "/login")
    public ResponseEntity<UserDTO> login(@RequestBody LoginDTO request) throws AppException {
        UserDTO userDTO = authService.login(request);
        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);

    }

    @PostMapping(value = "/register")
    public ResponseEntity<UserDTO> register(@RequestBody RegisterationDTO request) throws AppException {
        UserDTO userDTO = authService.register(request);
        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);

    }

}
