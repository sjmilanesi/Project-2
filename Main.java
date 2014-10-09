package com.company;
import java.util.Scanner;

//Project 2 by Steven Milanesi

public class Main {

    public static String[] eventArray;

    public Main() {
        eventArray = new String[]
                {
                        "CanJam", "CornHole", "HorseShoes", "LadderBall", "StickGame", "Washoos"
                };
    }



    public static void displayEvents() {
        for (int i = 0; i < eventArray.length; i++) {
            System.out.println(eventArray[i]);
        }
    }

    public static void displayOlympian() {
        for (int i = 0; i < olympianArray.length; i++) {
            System.out.println(olympianArray[i][0] + " ");
            for (int j = 1; j < olympianArray[i].length; j++) {
                System.out.println(olympianArray[i][j] + " ");
            }
        }
    }


    public static void main(String[] args)
    {
        if(args.length > 0)
        {
            for(int i = 0; i < args.length; i++)
            {
                if(args[i] == "e" || args[i] == "events")
                {
                    eventTrue = true;
                }
                else if(args[i] == "o" || args[i] == "olympians")
                {
                    olympianTrue = true;
                }
                else if(args[i] == "h" || args[i] =="help")
                {
                    System.out.println("Help");
                }
                else
                {
                    System.out.println("Invalid");
                }
            }
        }
    }

}
