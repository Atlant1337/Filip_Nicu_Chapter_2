package com.company;

import java.util.Scanner;

public class ex216
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        if (num1 > num2)
            System.out.printf("%d is larger",num1);

        if (num1 < num2)
            System.out.printf("%d is larger" ,num2);

        if (num1 == num2)
            System.out.println("These numbers are equal");
    }
}
