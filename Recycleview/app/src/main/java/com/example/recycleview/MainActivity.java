package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnNameItemClicked {
    ArrayList<String> names = new ArrayList<>();
    ArrayList<DataModel> dataList = new ArrayList<>();
    myAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycleView);


        dataList.add(new DataModel("sunham",1));
        dataList.add(new DataModel("kishan","kumar",2,""));
        dataList.add(new DataModel("kash","kar",3,""));




        myAdapter =new myAdapter(dataList,this,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myAdapter);

    }


    @Override
    public void onMyNameClicked(String name) {
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void deleteItem(int position) {
        names.remove(position);
        myAdapter.notifyDataSetChanged();
    }
}