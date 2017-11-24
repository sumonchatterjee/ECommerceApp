package com.example.test.ecommerce.data.source;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.test.ecommerce.data.IDataSource;
import com.example.test.ecommerce.data.model.Categories;
import com.example.test.ecommerce.data.model.MainResponse;
import com.example.test.ecommerce.data.model.Rankings;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by sumon.chatterjee on 23/11/17.
 */

public class RemoteDataSource implements IRemoteDataSource {

    private static final String LOG_TAG = RemoteDataSource.class.getSimpleName();

    private static RemoteDataSource INSTANCE;
    private ApiService service;

    private RemoteDataSource(ApiService service) {
        this.service = service;
    }

    public static RemoteDataSource getInstance(ApiService service) {
        if (INSTANCE == null) {
            INSTANCE = new RemoteDataSource(service);
        }
        return INSTANCE;
    }


    @Override
    public void getCategories(@NonNull final LoadDataCallback<MainResponse> callback) {
        Call<MainResponse> articleResponseCall = service.getDataDetails();
        articleResponseCall.enqueue(new Callback<MainResponse>() {


            @Override
            public void onResponse(Call<MainResponse> call, Response<MainResponse> response) {
                if (response.body() != null) {
                    callback.onDataLoaded(response.body().getCategories(),response.body().getRankings());
                }
            }


            @Override
            public void onFailure(Call<MainResponse> call, Throwable t) {
                callback.onDataNotAvailable();
            }
        });
    }
}
