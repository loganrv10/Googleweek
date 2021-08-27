package com.example.airplaneboardcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "" +intent.getStringExtra("name"),Toast.LENGTH_SHORT).show();
        Toast.makeText(context, "" +intent.getStringExtra("last name"),Toast.LENGTH_SHORT).show();
        Toast.makeText(context, "" +intent.getStringExtra("add"),Toast.LENGTH_SHORT).show();
        Toast.makeText(context, "" +intent.getStringExtra("occ"),Toast.LENGTH_SHORT).show();

    }
}
