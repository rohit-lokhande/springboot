package com.ecommerce.userservice.repository;

import com.ecommerce.userservice.entity.Buyer;
import com.ecommerce.userservice.entity.Seller;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SellerRepository extends CrudRepository<Seller, Integer> {

    @Query(value = "SELECT * FROM seller WHERE email_id = ?1 AND password =?2", nativeQuery = true)
    Seller getUserByEmailAndPassword(String emailAddress,String password);
}
