package com.company.library;

import java.util.Scanner;

public class libraryFunctions {

    public static int b = 7;

    public static int getInt(String prompt) {
        Scanner input = new Scanner(System.in);
        int intInput = -1;
        try {
            System.out.println(prompt);
            intInput = input.nextInt();
        } catch (Exception e) {
            System.out.println("incorrect input");
            System.out.println(e);
        }
        return (intInput);
    }

    public static double getDouble(String prompt) {
        Scanner input = new Scanner(System.in);
        int dblInput = -1;
        try {
            System.out.println(prompt);
            dblInput = input.nextInt();
        } catch (Exception e) {
            System.out.println("incorrect input");
            System.out.println(e);
        }
        return (dblInput);
    }

    public static int getString(String prompt) {
        Scanner input = new Scanner(System.in);
        int strInput = -1;
        try {
            System.out.println(prompt);
            strInput = input.nextInt();
        } catch (Exception e) {
            System.out.println("incorrect input");
            System.out.println(e);
        }
        return (strInput);
    }

}
