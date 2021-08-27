package com.example.birdview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BirdViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvBirdView;



    public BirdViewHolder(@NonNull View itemView) {
        super(itemView);
        mIvBirdView = itemView.findViewById(R.id.IvBirdView);

    }


    public void setData(Birds birds){
        mIvBirdView.setImageResource(birds.getImage());

    }
}
