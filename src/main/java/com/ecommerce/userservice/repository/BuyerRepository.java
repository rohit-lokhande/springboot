package com.ecommerce.userservice.repository;

import com.ecommerce.userservice.entity.Buyer;
import com.ecommerce.userservice.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BuyerRepository extends CrudRepository<Buyer, Integer> {

    @Query(value = "SELECT * FROM buyer WHERE email_id = ?1 AND password =?2", nativeQuery = true)
    Buyer getUserByEmailAndPassword(String emailAddress,String password);
}
