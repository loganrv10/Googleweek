package com.example.activitylifecycle;

public class StudentModel {
    private String name;
    private int age;
    private String address;
    private int DOB;
    private int imageId;

    public StudentModel(String name, int age, String address, int DOB, int imageId) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.DOB = DOB;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getDOB() {
        return DOB;
    }

    public int getImageId() {
        return imageId;
    }
}
