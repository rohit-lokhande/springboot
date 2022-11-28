package com.ecommerce.userservice.dto;

public class BuyerDTO {

    private Integer buyerId;
    private String name;
    private String email;
    private String phoneNumber;
    private boolean isPrivileged;
    private Float rewardPoint;
    private boolean isActive;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPrivileged() {
        return isPrivileged;
    }

    public void setPrivileged(boolean privileged) {
        isPrivileged = privileged;
    }

    public Float getRewardPoint() {
        return rewardPoint;
    }

    public void setRewardPoint(Float rewardPoint) {
        this.rewardPoint = rewardPoint;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
