package com.example.test.ecommerce.data;

import android.support.annotation.NonNull;

import com.example.test.ecommerce.data.model.Categories;
import com.example.test.ecommerce.data.model.MainResponse;
import com.example.test.ecommerce.data.model.Rankings;
import com.example.test.ecommerce.data.source.RemoteDataSource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sumon.chatterjee on 23/11/17.
 */

public class Repository implements RepositoryDataSource {

    private RemoteDataSource remoteDataSource;
    private static Repository INSTANCE = null;


    public static Repository getInstance(RemoteDataSource remoteDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new Repository(remoteDataSource);
        }
        return INSTANCE;
    }

    private Repository(@NonNull RemoteDataSource remoteDataSource) {
        this.remoteDataSource = remoteDataSource;

    }

    public static void destroyInstance() {
        INSTANCE = null;
    }


    @Override
    public void getCategories(IDataSource.LoadDataCallback<MainResponse> callback, boolean isNetworkAvailable) {
        if (isNetworkAvailable){
            getCategoriesFromRemoteDataSource(callback);
        }
    }


    private void getCategoriesFromRemoteDataSource(final IDataSource.LoadDataCallback<MainResponse> callback) {
        remoteDataSource.getCategories(new IDataSource.LoadDataCallback<MainResponse>() {
            @Override
            public void onDataLoaded(List<Categories> categoriesList, List<Rankings> rankingsList) {
                callback.onDataLoaded(categoriesList, rankingsList);
            }

            @Override
            public void onDataNotAvailable() {
             callback.onDataNotAvailable();
            }
        });
    }
}
