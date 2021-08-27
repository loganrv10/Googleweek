package com.example.birdview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BirdAdapter extends RecyclerView.Adapter<BirdViewHolder> {
    private ArrayList<Birds> birdsArrayList;


    public BirdAdapter(ArrayList<Birds> birdsArrayList) {
        this.birdsArrayList = birdsArrayList;
    }

    @Override
    public BirdViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dog_main,parent,false);
        return new BirdViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BirdViewHolder holder, int position) {
      Birds birds = birdsArrayList.get(position);
      holder.setData(birds);
    }

    @Override
    public int getItemCount() {
        return birdsArrayList.size();
    }
}
