package com.example.activitylifecycle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
   private ArrayList<StudentModel> studentList;
   private ItemClickListener itemClickListener;

    public Adapter(ArrayList<StudentModel> studentList, ItemClickListener itemClickListener){
      this.studentList = studentList;
      this.itemClickListener = itemClickListener;
    }



    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view,itemClickListener);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        StudentModel studentModel = studentList.get(position);
        holder.setData(studentModel);


    }


    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
