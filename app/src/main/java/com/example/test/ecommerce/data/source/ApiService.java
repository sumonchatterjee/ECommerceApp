package com.example.test.ecommerce.data.source;

import com.example.test.ecommerce.data.model.MainResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by sumon.chatterjee on 23/11/17.
 */

public interface ApiService {
    @GET("json")
    Call<MainResponse> getDataDetails();
}
