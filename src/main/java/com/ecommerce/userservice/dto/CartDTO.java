package com.ecommerce.userservice.dto;

import javax.swing.*;

public class CartDTO {

    private Integer id;
    private Integer buyerId;
    private Integer prodId;

    private Integer quantity;


    public CartDTO(Integer id, Integer buyerId, Integer prodId, Integer quantity) {
        this.id = id;
        this.buyerId = buyerId;
        this.prodId = prodId;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
