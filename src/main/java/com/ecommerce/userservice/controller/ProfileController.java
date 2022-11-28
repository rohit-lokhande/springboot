package com.ecommerce.userservice.controller;

import com.ecommerce.userservice.dto.*;
import com.ecommerce.userservice.exception.AppException;
import com.ecommerce.userservice.service.AuthService;
import com.ecommerce.userservice.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/profile")
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @GetMapping(value = "/wishlist")
    public ResponseEntity<List<WishListDTO>> getWishlist() throws AppException {
        List<WishListDTO> wishListDTOS = profileService.getWishlist();
        return new ResponseEntity<>(wishListDTOS, HttpStatus.CREATED);
    }

    @PostMapping(value = "/wishlist")
    public ResponseEntity<List<WishListDTO>> addWishlist(@RequestBody WishListDTO request) throws AppException {
        List<WishListDTO> wishListDTOS = profileService.addItem(request);
        return new ResponseEntity<>(wishListDTOS, HttpStatus.CREATED);
    }

    @PutMapping(value = "/wishlist")
    public ResponseEntity<List<WishListDTO>> register(@RequestBody WishListDTO request) throws AppException {
        List<WishListDTO> wishListDTOS = profileService.removeItem(request);
        return new ResponseEntity<>(wishListDTOS, HttpStatus.CREATED);
    }

    @PostMapping(value = "/cart")
    public ResponseEntity<List<CartDTO>> addCart(@RequestBody CartDTO request) throws AppException {
        List<CartDTO> cartDTOS = profileService.updateCart(request);
        return new ResponseEntity<>(cartDTOS, HttpStatus.CREATED);
    }

    @PutMapping(value = "/cart")
    public ResponseEntity<List<CartDTO>> removeCart(@RequestBody CartDTO request) throws AppException {
        List<CartDTO> cartDTOS = profileService.removeCart(request);
        return new ResponseEntity<>(cartDTOS, HttpStatus.CREATED);
    }

    @GetMapping(value = "/cart")
    public ResponseEntity<List<CartDTO>> getCart() throws AppException {
        List<CartDTO> cartDTOS = profileService.getCart();
        return new ResponseEntity<>(cartDTOS, HttpStatus.CREATED);
    }


}
