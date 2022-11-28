package com.ecommerce.userservice.entity;

import javax.persistence.*;

@Entity
public class Buyer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer buyerId;
    private String name;
    private String emailId;
    private String phoneNumber;
    private String password;
    private Float rewardPoint;
    private Boolean isPrivileged;
    private Boolean isActive;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Float getRewardPoint() {
        return rewardPoint;
    }

    public void setRewardPoint(Float rewardPoint) {
        this.rewardPoint = rewardPoint;
    }

    //
    public Boolean getPrivileged() {
        return isPrivileged;
    }

    public void setPrivileged(Boolean privileged) {
        isPrivileged = privileged;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


}
