package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.datepicker.MonthsPagerAdapter;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter {

    ArrayList<DataModel> myNames = new ArrayList<>();
    Context context;
    OnNameItemClicked mListener;



    public myAdapter(ArrayList<DataModel> Names,Context context , OnNameItemClicked mListener> ) {
        this.myNames = Names;
        this.context = context;
        this.mListener = mListener;

    }



    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.names_activity,parent,false);
        View view2 = inflater.inflate(R.layout.item_two,parent,false);

        if (viewType == 1){
            return new myViewHolder(view);
        }else{
            return  new view2);
        }


    }

    @Override
    public int getItemViewType(int position) {
       DataModel currentModel = myNames.get(position);
       if (currentModel.getType()== 1){
           return 1;
       }else {
           return 2;
       }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        DataModel dataModel = myNames.get(position);
        if (dataModel.getType() == 1){
            //We have to load viewholder 1
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) viewHolder;

        }else {
            //we have to load viewholder2
            ViewHolder2 holder2 = (ViewHolder2) holder;
            holder2.name.setText(dataModel.getName());
            holder2.lastName.setText(dataModel.getLastName());
        }

    }

    @Override
    public int getItemCount() {
        return myNames.size();
    }
}
