package com.example.wepart13_7notify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListerner{

    private ArrayList<Employee> employeesList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CardView mEtCardView;
    private EditText mEtName;
    private EditText mEtAge;
    private EditText mEtAddress;
    private Button mBtnDone;
    private EmployeeAdapter employeeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        builList();
        setRecyclerViews();
    }

    private void setRecyclerViews() {
        employeeAdapter = new EmployeeAdapter(employeesList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(employeeAdapter);
    }

    private void builList() {
        for (int i = 0; i < 50; i++) {
            Employee employee = new Employee("Subham kumar", i + 1, "Ponai park");
            employeesList.add(employee);
        }
    }


    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        mEtCardView = findViewById(R.id.editCardView);
        mEtName = findViewById(R.id.etName);
        mEtAddress = findViewById(R.id.etAddress);
        mEtAge = findViewById(R.id.etAge);
        mBtnDone = findViewById(R.id.btnDone);
    }


    @Override
    public void onItemClicked(int position, Employee employee) {
        mEtCardView.setVisibility(View.VISIBLE);
        mEtName.setText(employee.getName());
        mEtAge.setText(employee.getAge() + "");
        mEtAddress.setText(employee.getAddress());


        mBtnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEtCardView.setVisibility(View.GONE);

                Employee new_employee = new Employee(mEtName.getText().toString(), Integer.parseInt(mEtAge.getText().toString())
                        , mEtAddress.getText().toString());//edited details
                employeesList.set(position, new_employee);

//                employeesList.remove(employee); //this is for deleting
                employeeAdapter.notifyItemChanged(position);
//                employeeAdapter.notifyDataSetChanged(position);
            }
        });
    }
}