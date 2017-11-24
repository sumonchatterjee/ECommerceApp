package com.example.test.ecommerce.sources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.test.ecommerce.Injection;
import com.example.test.ecommerce.R;
import com.example.test.ecommerce.data.RepositoryDataSource;
import com.example.test.ecommerce.data.model.Categories;
import com.example.test.ecommerce.data.model.MainResponse;
import com.example.test.ecommerce.data.model.Rankings;
import com.example.test.ecommerce.data.source.IRemoteDataSource;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RepositoryDataSource repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

}
