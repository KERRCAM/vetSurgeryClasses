package com.company;

import com.company.library.libraryFunctions;
import com.company.objects.dog;

import java.util.ArrayList;

public class Main {




    public static void main(String[] args) {
        ArrayList<dog> dogList = new ArrayList<>();

        int intInput = libraryFunctions.getInt("type a number");

        dog myDog = new dog(6, "dog","big dog", 6,12.5, "dog food", 0.7, "monday");
        dog myOtherDog = new dog(3, "cat","small dog", 7,8.9, "cat food", 0.4, "teusday");

        System.out.println(myDog.toString());
        dogList.add(myDog);
        dogList.add(myOtherDog);
        System.out.println(dogList.get(1).getName());


    }






}
