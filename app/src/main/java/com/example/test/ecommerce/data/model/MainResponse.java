package com.example.test.ecommerce.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sumon.chatterjee on 22/11/17.
 */

public class MainResponse {
    @SerializedName("categories")
    private List<Categories> categories;

    @SerializedName("rankings")
    private List<Rankings> rankings;

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public List<Rankings> getRankings() {
        return rankings;
    }

    public void setRankings(List<Rankings> rankings) {
        this.rankings = rankings;
    }
}
