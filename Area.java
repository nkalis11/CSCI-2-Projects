/*
Name: Nicholas, Kalis
Project #: 01
Project Description: Write a class that has three overloaded static methods for calculating the areas of shapes
Project Filename: Kalis_Nicholas_Project_01
 */
public class Area {
    //Calculates the area of each shaped based on the user input and outputs based on each equation
   static void Area(int a) {
        System.out.println("The Area of the Circle is:" + Math.PI*a*a);
    }
    static void Area(int b, int c) {
        System.out.println("The Area of the Rectangle is:" + b*c);
    }
    static void Area(double pi, int d, int e) {
        System.out.println("The Area of the Cylinder is:" + Math.PI*d*d*e);
    }
}
