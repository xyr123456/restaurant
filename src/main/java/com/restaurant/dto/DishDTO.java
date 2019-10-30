package com.restaurant.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dishes_master_message")
public class DishDTO {
    @Id
    private String id;
    private String dishName;
    private String restaurantId;
    private String dishCategoryId;
    private String price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getDishCategoryId() {
        return dishCategoryId;
    }

    public void setDishCategoryId(String dishCategoryId) {
        this.dishCategoryId = dishCategoryId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
