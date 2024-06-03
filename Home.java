package com.company;

import java.util.ArrayList;

public class Home extends Building{
    //Fields
    private static ArrayList<Home> ListOfHouses = new ArrayList<>();
    private short numberOfFloors;
    private String ownerName;

    //Getters and Setters
    public static ArrayList<Home> getListOfHouses() {
        return ListOfHouses;
    }

    public static void setListOfHouses(ArrayList<Home> listOfHouses) {
        Home.ListOfHouses = listOfHouses;
    }

    public short getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(short numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    //Constructor with parameters
    public Home (float area, String address, short numberOfFloors, String ownerName){
        super(area, address);
        this.numberOfFloors = numberOfFloors;
        this.ownerName = ownerName;
        ListOfHouses.add(this);
    }

    //Methods
    public static Home mostSpacious(){
        Home mostSpaciousHouse = ListOfHouses.get(0);
        for (Home currentHouse : ListOfHouses) {
            if (currentHouse.getArea() / currentHouse.numberOfFloors > mostSpaciousHouse.getArea() / mostSpaciousHouse.numberOfFloors){
                mostSpaciousHouse = currentHouse;
            }
        }
        return mostSpaciousHouse;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        {
            s.append("ADDRESS: " + this.getAddress() + "\n");
            s.append("OWNER : " + this.ownerName + "\n");
            s.append("NUMBER OF FLOORS : " + this.numberOfFloors + "\n");
            s.append("TOTAL AREA: " + this.getArea());
        }
        return s.toString();
    }
}

