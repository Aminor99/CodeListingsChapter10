//Name: Asia Minor
//Date: 3-1-19
//Purpose: code listing 10.45, this program demonstrates a simple lamda expression
import java.util.Scanner;

public class LambaDemo{
   public static void main(String [] args){
      int num;
      //create a scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      //create an object that implements intcalculator
      IntCalculator2 square = x -> x * x;
      //get a number from the user
      System.out.print("Enter an integer number: ");
      num = keyboard.nextInt();
      //display the square of the number
      System.out.println("The square is " + square.calculate(num));
   }
}