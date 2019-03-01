package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        int value;
        int testing;
        String queston;
        keyboard= new Scanner(System.in);

        System.out.println("Think of a question, then pick a number between 0-100");
        value = keyboard.nextInt();
        if (value<=10){
            System.out.println("Ask again");
        }
        else if (value>=10 &&value<20){
            System.out.println("yes");
        }
        else if (value>=20 &&value<30){
            System.out.println("Definiltey");
        }
        else if (value>=30 &&value<40){
            System.out.println("no");
        }
        else if (value>=40 &&value<50){
            System.out.println("for sure");
        }
        else if (value>=50 &&value<60){
            System.out.println("i guess");
        }
        else if (value>=60 &&value<70){
            System.out.println("possibly");
        }
        else if (value>=70 &&value<80){
            System.out.println("probably not");
        }
        else if (value>=80 &&value<90){
            System.out.println("don't count on it");
        }
        else if (value>=90 &&value<=100){
            System.out.println("with time");
        }


















    }
}
