package me.afua;

import java.util.ArrayList;
import java.util.Scanner;

public class AddFeatures {

    public static void main(String[] args) {

        ArrayList <Integer> primeNumbers = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the last number for this range");
        int theNumber = keyboard.nextInt();
        keyboard.nextLine();

        for(int i=2; i<=theNumber; i++)
        {
            if(hasFactors(i))
            {
                System.out.printf("%d is not prime\n",i);
            }
            else
            {
                System.out.printf("%d is prime\n",i);
                primeNumbers.add(i);
            }

        }

        System.out.println(primeNumbers.size()+" prime numbers found");
        for (Integer aNumber:primeNumbers) {

            System.out.println("Prime Number "+(primeNumbers.indexOf(aNumber)+1)+": "+aNumber);
        }
    }

    public static boolean hasFactors(int toCheck)
    {
       boolean hasFactors = false;
        for(int i=2; i<toCheck; i++)
        {
            if(toCheck%i==0)
                hasFactors=true;
        }
        return hasFactors;
    }

}
