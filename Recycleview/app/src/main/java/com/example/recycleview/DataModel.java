package com.example.recycleview;

import android.provider.ContactsContract;

public class DataModel {
    String name ;
    String lastname;
    int type;
    String img;

    DataModel(String name, String lastname, int type, String img){
        this.name = name;
        this.lastname = lastname;
        this.type = type;
        this.img = img;
    }

    DataModel(String name, int type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getType() {
        return type;
    }

    public String getImg() {
        return img;
    }
}
