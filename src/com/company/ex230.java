package com.company;
import java.util.Scanner;

public class ex230
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter a number with five digits: ");
        num = input.nextInt();
        if ( (num >= 10000) && (num <= 99999) )
        {
            System.out.printf("%d   ", (num / 10000));
            System.out.printf("%d   ", (num / 1000) % 10);
            System.out.printf("%d   ", (num / 100) % 10);
            System.out.printf("%d   ", (num % 100) / 10);
            System.out.printf("%d   ", (num % 10));
        }
        if (num > 99999)
            System.out.println("You had entered a number more than five digits.");
        if (num <= 9999)
            System.out.println("You had entered a number less than five digits.");
    }
}