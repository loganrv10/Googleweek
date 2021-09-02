package com.example.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdpter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<Animals> animalList;

    public AnimalAdpter(ArrayList<Animals> animalList) {
        this.animalList = animalList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout
      ,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Animals animals = animalList.get(position);
   holder.setData(animals);
    }


    @Override
    public int getItemCount() {
        return animalList.size();
    }
}
