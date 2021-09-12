package com.company;

import java.util.Scanner;

public class ex215 {
    public static void main(String[] args)
    {

        Scanner input=new Scanner(System.in);

        int num1;
        int num2;
        int sum;
        int product;
        int difference;
        int quotient;

        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        sum	= num1 + num2;
        product	= num1 * num2;
        difference = num1 - num2;
        quotient = num1 / num2;

        System.out.printf("Sum is %d\n", +sum);
        System.out.printf("Product is %d\n", +product);
        System.out.printf("Difference is %d\n", +difference);
        System.out.printf("Quotient is %d\n", +quotient);

    }

}
