package com.example.activitylifecycle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    private RecyclerView recyclerView;
    private ArrayList<StudentModel> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        builtData();
        setRecycleView();

    }

    private void setRecycleView() {
        Adapter adapter = new Adapter(studentList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void builtData() {
        for (int i  =0; i < 100; i++){
            StudentModel studentModel = new StudentModel("Ram gopal Sharma",54,
                    "Juhu , Mumbai",1999,R.drawable.capture1);
            studentList.add(studentModel);
        }
    }

    private void initView() {
        recyclerView = findViewById(R.id.recycleView);
    }


    @Override
    public void onItemClickListener(StudentModel studentModel, int position) {
      new AlertDialog.Builder(this)
      .setTitle("This is ShoewTime")
      .setMessage(
              studentModel.getName() + "\n"
              + studentModel.getAge() + "\n"
              + studentModel.getAddress() + "\n"
              + studentModel.getDOB()
      ).setPositiveButton("ok", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {

          }
      }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {

          }
      }).show();


    }
}