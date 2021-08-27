package com.example.airplaneboardcast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MyReceiver myReceiver = new MyReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intentFilter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
         registerReceiver(myReceiver,intentFilter);

         IntentFilter intentFilter1 = new IntentFilter("My_Local_Receiver");

        LocalBroadcastManager.getInstance(this)
                .registerReceiver(myReceiver,intentFilter1);

        startActivity(new Intent(MainActivity.this,MainActivity2.class));

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(myReceiver);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(myReceiver);
    }
}