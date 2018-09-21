package me.afua;

import java.util.Scanner;

public class ListPrimeNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the last number for this range");
        int theNumber = keyboard.nextInt();
        keyboard.nextLine();

        //1 can be hard coded - it is not prime!!!
        System.out.println("1 is not prime ");
        //Check to see if all the numbers from 2  up till the number are prime
        for(int i=2; i<=theNumber; i++)
       {
           System.out.println(isThisPrime(i));
       }
    }

    //Create a method that takes a number
    public static String isThisPrime(int anyNumber)
    {
        int checkForPrime = 0;

        //Check to see if a single number is prime:
        for(int i=2; i<anyNumber; i++)
        {
            if(anyNumber%i==0)
            {
                checkForPrime++;
            }
        }

        if(checkForPrime>0)
            return anyNumber+" is not a prime number";
        else
            return anyNumber+" is a prime number";
    }

}
