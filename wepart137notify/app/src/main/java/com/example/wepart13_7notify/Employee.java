package com.example.wepart13_7notify;

public class Employee {
    private String name;
    private int age;
    private String address;

    public Employee(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
}
