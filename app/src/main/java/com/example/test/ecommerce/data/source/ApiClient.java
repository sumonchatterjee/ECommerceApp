package com.example.test.ecommerce.data.source;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Igor Havrylyuk on 27.03.2017.
 */

public class ApiClient {

   private static Retrofit sRetrofit = null;
    public static final String BASE_API_URL = "  https://stark-spire-93433.herokuapp.com/";

    public ApiClient() {
    }

    public static Retrofit getClient() {
        if (sRetrofit == null) {
            synchronized (Retrofit.class) {
                if (sRetrofit == null) {
                    OkHttpClient client = new OkHttpClient.Builder().build();
                    sRetrofit = new Retrofit.Builder()
                            .baseUrl(BASE_API_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .client(client)
                            .build();
                }
            }
        }
        return sRetrofit;
    }

}
