package com.example.fragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView mivAnimal;
    TextView textView;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mivAnimal = itemView.findViewById(R.id.ivAnimal);
        textView = itemView.findViewById(R.id.tvName);
    }

    public void setData(Animals animals){
        mivAnimal.setImageResource(animals.getImageId());
        textView.setText(animals.getName());
    }
}
