package com.example.editdatasetchange;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeeHolder extends RecyclerView.ViewHolder {

     TextView mTvName, mTvAge, mTvAddress;
     ImageView mivEdit;
     ItemClickListener itemClickListener;


    public EmployeeHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        initView(itemView);
        this.itemClickListener = itemClickListener;
    }

    private void initView(View itemView) {
        mTvAge = itemView.findViewById(R.id.TvAge);
        mivEdit = itemView.findViewById(R.id.ivEdit);
        mTvAddress = itemView.findViewById(R.id.TvAddress);
        mTvName =  itemView.findViewById(R.id.TvName);
    }

    public void setData(Employee employee){
        mTvName.setText(employee.getName());
        mTvAddress.setText(employee.getAddress());
        mTvAge.setText(employee.getAge()+"");
        mivEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(getAdapterPosition(),employee);
            }
        });

    }
}
