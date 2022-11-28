package com.ecommerce.userservice.repository;


import com.ecommerce.userservice.entity.Cart;
import com.ecommerce.userservice.entity.WishList;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
