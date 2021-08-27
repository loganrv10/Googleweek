package com.example.broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    myReceiver myReceiver = new myReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFiler = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
         registerReceiver(myReceiver,intentFiler);


    }
}