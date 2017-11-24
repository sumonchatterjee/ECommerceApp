package com.example.test.ecommerce.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by sumon.chatterjee on 22/11/17.
 */

public class Products {

    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    @SerializedName("date_added")
    private String date_added;

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

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public List<Variants> getVariants() {
        return variants;
    }

    public void setVariants(List<Variants> variants) {
        this.variants = variants;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public String getView_count() {
        return view_count;
    }

    public void setView_count(String view_count) {
        this.view_count = view_count;
    }

    @SerializedName("variants")
    private List<Variants> variants;

    @SerializedName("tax")
    private Tax tax;

    @SerializedName("view_count")
    private String view_count;

}
