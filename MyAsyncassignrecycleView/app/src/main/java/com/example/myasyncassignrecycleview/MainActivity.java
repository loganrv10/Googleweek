package com.example.myasyncassignrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    private Button mBtnDecrement, mBtnIncrement;

    ArrayList<String > arrayList=new ArrayList<>();
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       recyclerView = findViewById(R.id.recycleview);
       mBtnDecrement = findViewById(R.id.BtnDecrement);
       mBtnIncrement = findViewById(R.id.BtnIncrement);
       setBuiltList();
       setRecycleView();


       mBtnIncrement.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               arrayList.add("Subham kumar");
              adapter.notifyDataSetChanged();
           }
       });
       mBtnDecrement.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (arrayList.size()!=0){
                   arrayList.remove(0);
                   adapter.notifyDataSetChanged();

               }
           }
       });
    }










    private void setRecycleView() {
        Adapter adapter = new Adapter(arrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void setBuiltList() {
        arrayList.add("subham");
        arrayList.add("laxman");
        arrayList.add("ram");
        arrayList.add("jiraya");
        arrayList.add("goku");
    }
}