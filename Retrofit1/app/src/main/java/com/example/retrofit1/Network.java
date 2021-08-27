package com.example.retrofit1;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {
   private static final String Base_URL = "https://gist.githubusercontent.com/shivarajp/1eec28ad8a0083e44faf17927cccaebf/raw/7c398dcb27fe732cd957dbcc3b39da1fa1ea2b55/";

    public static Retrofit getRetrofit(){
       Retrofit retrofit = new Retrofit.Builder()
               .baseUrl(Base_URL)
               .addConverterFactory(GsonConverterFactory.create())
               .client(new OkHttpClient.Builder().build())
               .build();
       return retrofit;
    }

}
