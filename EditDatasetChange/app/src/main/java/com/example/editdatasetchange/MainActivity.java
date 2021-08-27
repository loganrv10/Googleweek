package com.example.editdatasetchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener{
    ArrayList<Employee> employeeList = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        builtList();
        setRecycleView();
    }

    private void setRecycleView() {
        EmployeeAdapter employeeAdapter = new EmployeeAdapter(employeeList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setAdapter(employeeAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    private void builtList() {
        for (int i = 0; i < 50; i++){
            Employee employee = new Employee("Subham kumar",22 + i,"kormangla Bengaluru india");
            employeeList.add(employee);
        }

    }

    private void initView() {
        recyclerView = findViewById(R.id.recycleView);
    }

    @Override
    public void onItemClicked(int position, Employee employee) {

    }
}