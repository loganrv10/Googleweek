package com.example.a2recycleviewa;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {
    private ImageView mImage;


    public Holder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);

    }

    void setData(Model model) {
        mImage.setImageResource(model.image);
    }

    public void initView(View itemView) {
      mImage = itemView.findViewById(R.id.Image);
    }

}
