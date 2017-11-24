package com.example.test.ecommerce.data;

import android.support.annotation.NonNull;

import com.example.test.ecommerce.data.model.Categories;
import com.example.test.ecommerce.data.model.MainResponse;
import com.example.test.ecommerce.data.model.Rankings;


public interface RepositoryDataSource {

    void getCategories(
                     IDataSource.LoadDataCallback<MainResponse> callback,
                     boolean isNetworkAvailable);



}
