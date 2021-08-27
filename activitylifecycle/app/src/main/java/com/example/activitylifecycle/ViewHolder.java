package com.example.activitylifecycle;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvStudentImage;
    private TextView mTvName, mTvAge, mTvAddress,mTvDob;
    RelativeLayout relativeLayout;
    private ItemClickListener itemClickListener;



    public ViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        mIvStudentImage = itemView.findViewById(R.id.IvStudentImage);
        mTvName = itemView.findViewById(R.id.TvName);
        mTvAddress = itemView.findViewById(R.id.TvAddress);
        relativeLayout = itemView.findViewById(R.id.relativeLayout);
        mTvAge = itemView.findViewById(R.id.TvAge);
        mTvDob = itemView.findViewById(R.id.TvDob);

    }

    public void setData(StudentModel studentModel){
        mIvStudentImage.setImageResource(studentModel.getImageId());
        mTvName.setText(studentModel.getName());
        mTvDob.setText(studentModel.getDOB()+"");
        mTvAge.setText(studentModel.getAge()+"");
        mTvAddress.setText(studentModel.getAddress());
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              itemClickListener.onItemClickListener(studentModel,getAdapterPosition());
            }
        });
    }
}
