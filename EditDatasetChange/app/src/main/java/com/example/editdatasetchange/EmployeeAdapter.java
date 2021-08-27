package com.example.editdatasetchange;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeHolder> {
   ArrayList<Employee> employeeList;
   ItemClickListener itemClickListener;

   public EmployeeAdapter(ArrayList<Employee> employeeList,ItemClickListener itemClickListener){
       this.employeeList = employeeList;
       this.itemClickListener = itemClickListener;
   }


    @Override
    public EmployeeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new EmployeeHolder(view,itemClickListener);
    }


    @Override
    public void onBindViewHolder(@NonNull EmployeeHolder holder, int position) {
    Employee employee = employeeList.get(position);
    holder.setData(employee);
    }


    @Override
    public int getItemCount() {
        return employeeList.size();
    }
}
