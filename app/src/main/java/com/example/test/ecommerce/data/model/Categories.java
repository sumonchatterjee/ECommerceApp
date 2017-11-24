package com.example.test.ecommerce.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sumon.chatterjee on 22/11/17.
 */

public class Categories {

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("products")
    private List<Products> products;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }


}
