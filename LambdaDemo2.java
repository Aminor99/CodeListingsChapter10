//Name: Asia Minor
//Date: 3-1-19 
//Purpose: code listing 10.46, this program demonstrates a lambda epression that uses a final local variable
import java.util.Scanner; 

public class LambdaDemo2{
   public static void main(String [] arg){
      final int factor = 10;
      int num;
      //create a scanner object for the keyboard input
      Scanner keyboard = new Scanner(System.in);
      //create an object that implements intcalculator
      IntCalculator2 multiplier = x -> x * factor;
      //get a number from the user
      System.out.print("Enter an integer number: ");
      num = keyboard.nextInt();
      //display the number mulitplied by 10
      System.out.println("Multiplied by 10, that number is " + multiplier.calculate(num));
   }
}