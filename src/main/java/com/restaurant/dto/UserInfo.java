package com.restaurant.dto;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "merchant_master_message")
public class UserInfo {
    @Id
    private String id;
    private String userId;
    private String password;

    @OneToMany(mappedBy = "userInfo")
    private List<RestaurantDTO> restaurantDTOList=new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
