package com.example.a2recycleviewa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView recyclerView2;

    ArrayList<Model> modelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setRecycleView();
        setRecycleView2();
    }

    private void setRecycleView2() {
        for (int i = 0; i < 10; i++){
            if (i % 2 ==0){
                modelList.add(new Model(R.drawable.dance));
            }else {
                modelList.add(new Model(R.drawable.man));
            }
        }
        Adapter adapter = new Adapter(modelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView2.setAdapter(adapter);
        recyclerView2.setLayoutManager(linearLayoutManager);
    }

    private void setRecycleView() {
        for (int i = 0; i < 10; i++){
           if (i % 2 ==0){
               modelList.add(new Model(R.drawable.aeroplane));
           }else {
               modelList.add(new Model(R.drawable.dep));
           }
        }
        Adapter adapter = new Adapter(modelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void initView() {
        recyclerView = findViewById(R.id.recycleView);
        recyclerView2 = findViewById(R.id.recycleView2);
    }
}