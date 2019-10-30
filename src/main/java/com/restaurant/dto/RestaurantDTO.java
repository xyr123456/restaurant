package com.restaurant.dto;

import javax.persistence.*;

@Entity
@Table(name = "restaurant_master_message")
public class RestaurantDTO {
    @Id
    private String id;
    private String restaurantName;
    private String owner_id;
    private String headerPoster;
    private String headerName;

    @ManyToOne(targetEntity=UserInfo.class)
    @JoinColumn(name="owner_id")
    private UserInfo userInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public String getHeaderPoster() {
        return headerPoster;
    }

    public void setHeaderPoster(String headerPoster) {
        this.headerPoster = headerPoster;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
