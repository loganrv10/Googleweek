package com.example.myasyncassignrecycleview;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {

    TextView mtvNum;

    public Holder(@NonNull View itemView) {
        super(itemView);
        mtvNum = itemView.findViewById(R.id.tvNum);

    }

    public void setData(String model){
        mtvNum.setText(model);
    }


}
