package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    private String ID;
    private String name;
    @SerializedName("size") private int height;

    public Mountain(String ID, String name, int height) {
        this.ID = ID;
        this.name = name;
        this.height = height;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
