package com.ecommerce.userservice.service;

import com.ecommerce.userservice.dto.CartDTO;
import com.ecommerce.userservice.dto.WishListDTO;

import java.util.List;

public interface ProfileService {
    List<WishListDTO> addItem(WishListDTO request);

    List<WishListDTO> removeItem(WishListDTO request);

    List<WishListDTO> getWishlist();

    List<CartDTO> updateCart(CartDTO request);

    List<CartDTO> getCart();

    List<CartDTO> removeCart(CartDTO request);


}
