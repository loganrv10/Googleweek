package com.example.we_part_7_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
    private ArrayList<Student> studentList = new ArrayList<Student>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildStudentList();
        setRecyclerView();
    }

    private void buildStudentList() {
        studentList = new ArrayList<Student>();
        Student students1 = new Student("Aditya", 20, "Fa3_035");
        studentList.add(students1);
        Student student2 = new Student("Shubhum", 23, "Fa3_037");
        studentList.add(student2);
        Student student3 = new Student("Sudarshan", 27, "Fa3_26");
        studentList.add(student3);
        for (int i = 0; i < 13; i++) {
            Student student = new Student("XYZ" + i ,21,"fa3_056");
            studentList.add(student);
        }
    }

    private void setRecyclerView() {
        StudentAdapter studentAdapter = new StudentAdapter(studentList);
        //you can also use different layoutManager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }

    private void initViews(){
        recyclerView = findViewById(R.id.recycleView);
    }
}