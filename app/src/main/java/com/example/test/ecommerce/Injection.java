package com.example.test.ecommerce;

import android.content.Context;
import android.support.annotation.NonNull;

import com.example.test.ecommerce.data.Repository;
import com.example.test.ecommerce.data.source.ApiClient;
import com.example.test.ecommerce.data.source.ApiService;
import com.example.test.ecommerce.data.source.RemoteDataSource;

/**
 * Created by sumon.chatterjee on 22/11/17.
 */

public class Injection {

    public static Repository provideRepository(@NonNull Context context) {

        ApiService apiService = ApiClient.getClient().create(ApiService.class);
        return Repository.getInstance(RemoteDataSource.getInstance(apiService));
    }
}
