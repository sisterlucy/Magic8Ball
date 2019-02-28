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
            System.out.println("Definiltey");
        }







    }
}
