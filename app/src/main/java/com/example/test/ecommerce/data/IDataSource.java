package com.example.test.ecommerce.data;

import com.example.test.ecommerce.data.model.Categories;
import com.example.test.ecommerce.data.model.Rankings;

import java.util.List;

public interface IDataSource {

    interface LoadDataCallback<T> {

        void onDataLoaded(List<Categories> categoriesList,List<Rankings> rankingsList);

        void onDataNotAvailable();
    }
}
