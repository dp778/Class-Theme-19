package com.company;

public class Building {
    //Fields
    private float area;
    private String address;

    //Getters and Setters
    public float getArea(){ return area; }
    public void setArea(float area) { this.area = area; }

    public String getAddress(){ return address; }
    public void setAddress(String address) { this.address = address; }

    //Constructor with parameters
    public Building(float area, String address){
        this.area = area;
        this.address = address;
    }
}
