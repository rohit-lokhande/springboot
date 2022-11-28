package com.ecommerce.userservice.service;

import com.ecommerce.userservice.dto.*;
import com.ecommerce.userservice.entity.*;
import com.ecommerce.userservice.exception.AppException;
import com.ecommerce.userservice.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service(value = "profileService")
@Transactional
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    WishListRepository wishListRepository;
    @Autowired
    CartRepository cartRepository;

    @Override
    public List<WishListDTO> addItem(WishListDTO request) {
        WishList wishList = new WishList();
        wishList.setProdId(request.getProdId());
        wishList.setBuyerId(request.getBuyerId());
        wishListRepository.save(wishList);
        return getWishlist();
    }

    @Override
    public List<WishListDTO> removeItem(WishListDTO request) {
        WishList wishList = new WishList();
        wishList.setProdId(request.getProdId());
        wishList.setBuyerId(request.getBuyerId());
        wishListRepository.delete(wishList);
        return getWishlist();
    }

    @Override
    public List<WishListDTO> getWishlist() {
        Iterable<WishList> tempWishList = wishListRepository.findAll();
        List<WishListDTO> wishListDTOS = new ArrayList<>();
        for (WishList curr : tempWishList) {
            wishListDTOS.add(new WishListDTO(curr.getId(),
                    curr.getBuyerId(), curr.getProdId()
            ));
        }
        return wishListDTOS;
    }

    @Override
    public List<CartDTO> updateCart(CartDTO request) {
        Cart cart = new Cart();
        cart.setProductId(request.getProdId());
        cart.setBuyerId(request.getBuyerId());
        cart.setQuantity(request.getQuantity());
        cartRepository.save(cart);
        return getCart();
    }

    @Override
    public List<CartDTO> getCart() {
        Iterable<Cart> tempWishList = cartRepository.findAll();
        List<CartDTO> cartDTOS = new ArrayList<>();
        for (Cart curr : tempWishList) {
            cartDTOS.add(new CartDTO(curr.getId(),
                    curr.getBuyerId(), curr.getProductId(), curr.getQuantity()
            ));
        }
        return cartDTOS;
    }

    @Override
    public List<CartDTO> removeCart(CartDTO request) {
        cartRepository.deleteById(request.getId());
        return getCart();
    }
}
