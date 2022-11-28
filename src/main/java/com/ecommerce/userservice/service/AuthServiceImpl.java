package com.ecommerce.userservice.service;

import com.ecommerce.userservice.dto.LoginDTO;
import com.ecommerce.userservice.dto.RegisterationDTO;
import com.ecommerce.userservice.dto.UserDTO;
import com.ecommerce.userservice.entity.Buyer;
import com.ecommerce.userservice.entity.Seller;
import com.ecommerce.userservice.entity.User;
import com.ecommerce.userservice.exception.AppException;
import com.ecommerce.userservice.repository.AuthRepository;
import com.ecommerce.userservice.repository.BuyerRepository;
import com.ecommerce.userservice.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "authService")
@Transactional
public class AuthServiceImpl implements AuthService {

    @Autowired
    AuthRepository authRepository;
    @Autowired
    BuyerRepository buyerRepository;
    @Autowired
    SellerRepository sellerRepository;

    @Override
    public UserDTO login(LoginDTO request) throws AppException {
        UserDTO userDTO = new UserDTO();
        if (request.getRole().equals("buyer")) {
            Buyer buyer = buyerRepository.getUserByEmailAndPassword(request.getEmail(), request.getPassword());
            String token = "SF21212.34344232fDSFEWRTWTSs";
            User user = new User();
            user.setAuthToken(token);
            user.setRole("buyer");
            user.setEmailId(buyer.getEmailId());
            user = authRepository.save(user);

            userDTO.setUserId(user.getUserId());
            userDTO.setAuthToken(token);
            userDTO.setEmailId(buyer.getEmailId());
            userDTO.setUserName(buyer.getName());
            userDTO.setPhoneNumber(buyer.getPhoneNumber());
            userDTO.setRole("buyer");

        } else {
            Seller seller = sellerRepository.getUserByEmailAndPassword(request.getEmail(), request.getPassword());
            String token = "SF21212.34344232fDSFEWRTWTSs";
            User user = new User();
            user.setAuthToken(token);
            user.setRole("seller");
            user.setEmailId(seller.getEmailId());
            user = authRepository.save(user);

            userDTO.setUserId(user.getUserId());
            userDTO.setAuthToken(token);
            userDTO.setEmailId(seller.getEmailId());
            userDTO.setUserName(seller.getName());
            userDTO.setPhoneNumber(seller.getPhoneNumber());
            userDTO.setRole("seller");
        }
        return userDTO;
    }

    @Override
    public UserDTO register(RegisterationDTO request) throws AppException {
        UserDTO userDTO = new UserDTO();
        if (request.getRole().equals("buyer")) {
            Buyer buyer = new Buyer();
            buyer.setPrivileged(request.isPrivileged());
            buyer.setActive(request.isActive());
            buyer.setName(request.getName());
            buyer.setEmailId(request.getEmail());
            buyer.setPhoneNumber(request.getPhoneNumber());
            buyer.setPassword(request.getPassword());
            buyer = buyerRepository.save(buyer);

            String token = "SF21212.34344232fDSFEWRTWTSs";
            User user = new User();
            user.setAuthToken(token);
            user.setRole("buyer");
            user.setEmailId(buyer.getEmailId());
            user = authRepository.save(user);

            userDTO.setUserId(user.getUserId());
            userDTO.setAuthToken(token);
            userDTO.setEmailId(buyer.getEmailId());
            userDTO.setUserName(buyer.getName());
            userDTO.setPhoneNumber(buyer.getPhoneNumber());
            userDTO.setRole("buyer");


        } else {

            Seller seller = new Seller();
            seller.setActive(request.isActive());
            seller.setName(request.getName());
            seller.setEmailId(request.getEmail());
            seller.setPhoneNumber(request.getPhoneNumber());
            seller.setPassword(request.getPassword());
            seller = sellerRepository.save(seller);

            String token = "SF21212.34344232fDSFEWRTWTSs";
            User user = new User();
            user.setAuthToken(token);
            user.setRole("seller");
            user.setEmailId(seller.getEmailId());
            user = authRepository.save(user);

            userDTO.setUserId(user.getUserId());
            userDTO.setAuthToken(token);
            userDTO.setEmailId(seller.getEmailId());
            userDTO.setUserName(seller.getName());
            userDTO.setPhoneNumber(seller.getPhoneNumber());
            userDTO.setRole("seller");
        }
        return userDTO;
    }
}
