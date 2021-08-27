package com.example.myasyncassignrecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Holder> {
    ArrayList<String> arrayList;
    public Adapter(ArrayList<String> arrayList) {
       this.arrayList = arrayList;
    }

    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
    String model = arrayList.get(position);
    holder.setData(model);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
