package com.example.birdview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Birds> birdsArrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);
        builtData();
        setRecycleView();

    }

    private void setRecycleView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        BirdAdapter birdAdapter = new BirdAdapter(birdsArrayList);
        recyclerView.setAdapter(birdAdapter);
    }


    private void builtData() {
      birdsArrayList = new ArrayList<>();
      Birds birds = new Birds(R.drawable.lion);
        birdsArrayList.add(birds);
      Birds birds1 = new Birds(R.drawable.leopard);
      birdsArrayList.add(birds1);
        for (int i = 0; i < 100; i++) {
            if (i % 4 == 0) {
                birdsArrayList.add(birds);
            } else if (i % 4 == 1) {
                birdsArrayList.add(birds1);
            }
        }

    }
}