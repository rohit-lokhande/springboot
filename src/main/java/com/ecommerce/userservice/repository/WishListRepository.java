package com.ecommerce.userservice.repository;


import com.ecommerce.userservice.dto.WishListDTO;
import com.ecommerce.userservice.entity.Buyer;
import com.ecommerce.userservice.entity.WishList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WishListRepository extends CrudRepository<WishList, Integer> {
}
