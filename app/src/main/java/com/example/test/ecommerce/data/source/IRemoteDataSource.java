package com.example.test.ecommerce.data.source;

import android.support.annotation.NonNull;

import com.example.test.ecommerce.data.IDataSource;
import com.example.test.ecommerce.data.model.Categories;
import com.example.test.ecommerce.data.model.MainResponse;
import com.example.test.ecommerce.data.model.Rankings;


/**
 * Created by Igor Havrylyuk on 27.03.2017.
 */

public interface IRemoteDataSource extends IDataSource {

    void getCategories(@NonNull IDataSource.LoadDataCallback<MainResponse> callback);

}
