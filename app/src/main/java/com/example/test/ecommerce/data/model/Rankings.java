package com.example.test.ecommerce.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sumon.chatterjee on 22/11/17.
 */

public class Rankings {

    @SerializedName("ranking")
    private String ranking;

    @SerializedName("products")
    private List<Products> products;

}
