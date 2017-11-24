package com.example.test.ecommerce.detail;

import android.support.annotation.NonNull;

import com.example.test.ecommerce.data.RepositoryDataSource;
import com.example.test.ecommerce.data.model.Categories;
import com.example.test.ecommerce.data.model.MainResponse;
import com.example.test.ecommerce.data.model.Rankings;
import com.example.test.ecommerce.data.source.IRemoteDataSource;

import java.util.List;

/**
 * Created by sumon.chatterjee on 24/11/17.
 */

public class CategoriesPresenter implements CategoriesContract.Presenter {
    private CategoriesContract.View view;
    private RepositoryDataSource repository;

    public CategoriesPresenter(@NonNull RepositoryDataSource repository,
                         @NonNull CategoriesContract.View view) {
        this.repository = repository;
        this.view = view;
    }

    @Override
    public void loadDataDetails() {
        loadNewsFromRepository(view.isNetworkAvailable());
    }


    private void loadNewsFromRepository(boolean isNetworkAvailable ) {

        repository.getCategories(new IRemoteDataSource.LoadDataCallback<MainResponse>() {

            @Override
            public void onDataLoaded(List<Categories> categoriesList, List<Rankings> rankingsList) {

                view.showDetailData(categoriesList,rankingsList);

            }

            @Override
            public void onDataNotAvailable() {
               view.showError();
            }
        }, isNetworkAvailable);


    }
}
