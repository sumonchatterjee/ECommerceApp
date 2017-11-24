package com.example.test.ecommerce.detail;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.test.ecommerce.Injection;
import com.example.test.ecommerce.R;
import com.example.test.ecommerce.data.model.Categories;
import com.example.test.ecommerce.data.model.Rankings;

import java.util.List;

/**
 * Created by sumon.chatterjee on 24/11/17.
 */

public class CategoryActivity extends AppCompatActivity implements CategoriesContract.View{

    CategoriesPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initPresenter();
        presenter.loadDataDetails();
    }



    private void initPresenter() {
        presenter = new CategoriesPresenter(Injection.provideRepository(getApplicationContext()),this);
    }



    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void setRefreshing(boolean refreshing) {

    }

    @Override
    public boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


    @Override
    public void showError() {

    }


    @Override
    public void showDetailData(@NonNull List<Categories> sources, @NonNull List<Rankings> ranking) {
      if(sources!=null){

      }
    }
}
