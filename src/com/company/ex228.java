package com.company;
import java.util.Scanner;


public class ex228 {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);
        int radius=0;
        double pi=Math.PI;

        System.out.println("Enter radius:");
        radius=input.nextInt();
        System.out.printf("Diameter =  %.1f\n", 2*(double)radius);

        System.out.printf("Circumference =  %.1f\n", 2*pi*(double)radius);

        System.out.printf("Area =  %.1f", pi*(double)(radius*radius));
    }
}
