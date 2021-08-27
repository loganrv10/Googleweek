package com.example.airplaneboardcast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button mbottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = new Intent("My_Local_Receiver");
        intent.putExtra("name","Subham");
        intent.putExtra("last name","Kumar");
        intent.putExtra("occ","Android developer");
        intent.putExtra("add","Bangalore");

        mbottom = findViewById(R.id.button);
        mbottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LocalBroadcastManager.getInstance(MainActivity2.this).sendBroadcast(intent);
            }
        });
    }
}