package me.afua;

import java.util.Scanner;

public class AddAMethod {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the last number for this range");
        int theNumber = keyboard.nextInt();
        keyboard.nextLine();

        //Check to see if a single number is prime
        System.out.println(isThisPrime(theNumber));
    }

    //Create a method that takes a number
    public static String isThisPrime(int anyNumber)
    {
        int checkForPrime = 0;

        //Check to see if a single number is prime:
        for(int i=2; i<=anyNumber; i++)
        {
            if(anyNumber%i==0)
            {
                checkForPrime++;
            }
        }

        if(checkForPrime>0)
           return anyNumber+" is not prime";
        else
            return anyNumber+" is prime";
    }

}
