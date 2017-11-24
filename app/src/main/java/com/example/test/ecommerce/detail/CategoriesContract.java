package com.example.test.ecommerce.detail;

import android.support.annotation.NonNull;


import com.example.test.ecommerce.BasePresenter;
import com.example.test.ecommerce.BaseView;
import com.example.test.ecommerce.data.model.Categories;
import com.example.test.ecommerce.data.model.Rankings;

import java.util.List;

public interface CategoriesContract {

    interface View extends BaseView {

        void showDetailData(@NonNull List<Categories> sources,@NonNull List<Rankings> ranking);

        void setRefreshing(boolean refreshing);

        boolean isNetworkAvailable();

        boolean isActive();

        void showError();

    }

    interface Presenter extends BasePresenter {

        void loadDataDetails();
    }
}
