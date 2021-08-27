package com.example.recycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myViewHolder extends RecyclerView.ViewHolder {
    TextView nameTv;
    ImageView IvCancel;


    public myViewHolder(@NonNull  View itemView) {
        super(itemView);

        nameTv = itemView.findViewById(R.id.TvtextView);
        IvCancel = itemView.findViewById(R.id.IvCancel);
    }
}


class Holder2 extends RecyclerView.ViewHolder{
    TextView name , lastname;
    ImageView image2;


    public Holder2(@NonNull View itemView) {
        super(itemView);
       name = itemView.findViewById(R.id.TvtextView2);
       lastname = itemView.findViewById(R.id.TvtextView3);
       image2 = itemView.findViewById(R.id.Image);
    }
}