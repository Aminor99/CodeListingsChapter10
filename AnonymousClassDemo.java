//Name: Asia Minor
//Date: 3-1-19
//Purpose: code listing 10.43, this program demonstrates an anonymous inner class
import java.util.Scanner;
public class AnonymousClassDemo{
   public static void main(String[] args){
      int num;
      //create a scnner object keyboard input
      Scanner keyboard = new Scanner(System.in);
      //create an object that implements IntCalucaltor
      IntCalculator square = new IntCalculator(){
         public int calculate(int number){
            return number * number;
         }
      };
      //get a number from the user
      System.out.print("Enter an integer number: ");
      num = keyboardInt();
      //display the square of the number
      System.out.println("The square is " + square.calculate(num));
   }
}