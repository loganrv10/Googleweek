package com.example.retrofit1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);

        Retrofit retrofit = Network.getRetrofit();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);

        apiInterface.getNews().enqueue(new Callback<NewsDTO>() {
            @Override
            public void onResponse(Call<NewsDTO> call, Response<NewsDTO> response) {
                String resData = "";
                String data = response.body().getHeadline();
                for (NewsDTO item : data) {
                    resData += item.getHeadline();
                }

                text.setText(resData);
                //Log.d("data", data);
            }

            @Override
            public void onFailure(Call<NewsDTO> call, Throwable t) {

            }
        });

    }
}