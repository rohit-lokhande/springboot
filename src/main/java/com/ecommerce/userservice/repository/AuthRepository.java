package com.ecommerce.userservice.repository;

import com.ecommerce.userservice.entity.Buyer;
import com.ecommerce.userservice.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AuthRepository extends CrudRepository<User, Integer> {

}

