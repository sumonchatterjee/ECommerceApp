package com.example.test.ecommerce.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sumon.chatterjee on 22/11/17.
 */

public class Variants {
    @SerializedName("id")
    private String id;

    @SerializedName("color")
    private String color;

    @SerializedName("size")
    private String size;

    @SerializedName("price")
    private String price;

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

}
