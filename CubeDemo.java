//Name: Asia Minor
//Date: 2-26-19
//Purpose: code listing 10.12, demosntrates passing arguments to a superclass constructor

import java.util.Scanner;

public class CubeDemo{
   public static void main(String[] args){
      double length; //the cubes lenght
      double width; //the cubes width
      double height; //the cubes height
      //create a scanner object for eyboard input
      Scanner keyboard = new Scanner(System.in);
      //get cubes length
      System.out.println("Enter the following dimensions of a cube:");
      System.out.print("Length: ");
      length = keyboard.nextDouble();
      //set the cubes width
      System.out.print("Width: ");
      width = keyboard.nextDouble();
      //get the cuves height
      System.out.print("Height: ");
      height = keyboard.nextDouble();
      //create a cuve object and pass the dimensions to the constructor
      Cube myCube = new Cube (length, width, height);
      //display the cubes properties
      System.out.println("Here are the cube's properties.");
      System.out.println("Length: " + myCube.getLength());
      System.out.println("Width: " + myCube.getWidth());
      System.out.println("Height: " + myCube.getHeight());
      System.out.println("Base Area: " + myCube.getArea());
      System.out.println("Surface Area: " + myCube.getSurfaceArea());
      System.out.println("Volume: " + myCube.getVolume());
   }
}  
