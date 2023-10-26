package Javaprogrammeweek2handwritting;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Programme_6AreaOfCircle {
    public static void main(String[] args) {
        //Scanner declarration for reading the input form console
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the radius: ");
        Double radius = scanner.nextDouble();
        AreaOfCircle(radius);
        //closing the scanner object
        scanner.close();
    }
    //Calulating the area of circl
    public static void AreaOfCircle(double radius){
        double pi= Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of Circle is :"+ area);
    }
}
