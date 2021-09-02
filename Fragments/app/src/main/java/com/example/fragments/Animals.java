package com.example.fragments;

public class Animals {
    private String name;
    private int imageId;

    public Animals(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
