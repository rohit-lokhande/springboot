package com.ecommerce.userservice.dto;

public class WishListDTO {

    private Integer id;
    private Integer buyerId;
    private Integer prodId;

    public WishListDTO(Integer id, Integer buyerId, Integer prodId) {
        this.id = id;
        this.buyerId = buyerId;
        this.prodId = prodId;
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
}
