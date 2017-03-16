package com.example.a97building.minihome;

/**
 * Created by 97building on 2017/3/10.
 */

public class Group {

    private String name;
    private int protrait;

    public Group(String name,int protrait){
        this.name = name;
        this.protrait = protrait;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getProtrait() {
        return protrait;
    }
}
