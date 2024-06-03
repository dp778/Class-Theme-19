package com.company;

public class Run {
    public static void main(String[] args) {
        Home firstHouse = new Home(200.75f, "123 Main Street", (short) 2, "John Wick");
        Home secondHouse = new Home(150.0f, "456 Elm Avenue", (short) 3, "Sara Brown");
        Home thirdHouse = new Home(100.25f, "789 Oak Lane", (short) 1, "Michael Johnson");
        Home fourthHouse = new Home(180.5f, "321 Maple Road", (short) 2, "Emily Smith");

        printHouseInfo(firstHouse);
        printHouseInfo(secondHouse);
        printHouseInfo(thirdHouse);
        printHouseInfo(fourthHouse);
        printMostSpacious();
    }

    public static void printHouseInfo(Building building){
        System.out.println("----------------<+>----------------");
        System.out.println(building);
        System.out.println("----------------<+>----------------\n");
    }

    public static void printMostSpacious(){
        Home mostSpacious = Home.mostSpacious();
        System.out.println("----------------<+>----------------");
        System.out.println("        MOST SPACIOUS HOUSE ");
        printHouseInfo(mostSpacious);
    }
}
