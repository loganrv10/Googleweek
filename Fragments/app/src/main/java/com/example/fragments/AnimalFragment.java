package com.example.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class AnimalFragment extends Fragment {
    RecyclerView recyclerView;
    private ArrayList<Animals> animalList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        buildData();
        setRecycleview();
    }

    private void setRecycleview() {
        AnimalAdpter animalAdpter = new AnimalAdpter(animalList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(animalAdpter);
    }

    private void buildData() {
        for (int i = 0; i < 100; i++) {
            Animals animals = new Animals("dogi",R.drawable.jim);
            animalList.add(animals);

        }

    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.recycleview);
    }
}