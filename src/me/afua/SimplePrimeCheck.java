package me.afua;

import java.util.Scanner;

public class SimplePrimeCheck {
    public static void main(String[] args) {
        //Get user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the last number for this range");
        int theNumber = keyboard.nextInt();
        keyboard.nextLine();

        //Count the factors between 2 and the number
        int countTheFactors = 0;


       //Check to see if a single number is prime:
        for(int i=2; i<=theNumber; i++)
        {
            if(theNumber%i==0)
            {
                //If the number IS NOT prime, the factors will be more than 0
                countTheFactors++;
            }
        }

        if(countTheFactors>0)
            System.out.println("The number is not prime");
        else
            System.out.println("The number is prime");


    }


}
