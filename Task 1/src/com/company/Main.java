package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] colorsArray = {"red","blue","green","yellow","white","black","purple"};

        ArrayList<String> colors = new ArrayList<String>();
        for(int i = 0; i<colorsArray.length; i++) colors.add(colorsArray[i]);

        System.out.println("---Colors ArrayList before---");
        for (String color: colors) System.out.println(color);

        colors.remove(2);
        colors.add("pink");
        colors.add(0,"orange");

        System.out.println("---Colors ArrayList after---");
        for (String color: colors) System.out.println(color);

        ArrayList<String> colorsSublist = new ArrayList<String>();
        colorsSublist.addAll(colors.subList(2,5));

        System.out.println("---Colors subList---");
        for (String color: colorsSublist) System.out.println(color);

    }
}
