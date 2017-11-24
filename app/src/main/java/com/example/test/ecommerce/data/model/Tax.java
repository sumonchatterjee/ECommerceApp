package com.example.test.ecommerce.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sumon.chatterjee on 22/11/17.
 */

public class Tax {

    @SerializedName("name")
    private String name;

    @SerializedName("value")
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
