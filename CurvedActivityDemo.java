//Name: Asia Minor
//Date: 2-26-19
//Purpose: code listing 10.14. this program demonstrates the crvedactivity class, which
//inherits from the graded activity class

import java.util.Scanner;

public class CurvedActivityDemo{
   public static void main(String[] args){
      double score; // raw score
      double curvePercent; //curve percentage
      //creates a Scanner object to read keyboard input
      Scanner keyboard = new Scanner(System.in);
      //get unadjusted exam score
      System.out.print("Enter the students raw numeric score: ");
      score = keyboard.nextDouble();
      //get the curve percentage
      System.out.print("Enter the curver percentage: ");
      curvePercent = keyboard.nextDouble();
      //create a curved activity object
      CurvedActivity curvedExam = new CurvedActivity(curvePercent);
      //set the exam score
      curvedExam.setScore(score);
      //display the raw score
      System.out.println("The raw score is " + curvedExam.getRawScore() + " points.");
      //display the curved score
      System.out.println("The curved score is " + curvedExam.getScore());
      //display the curved score
      System.out.println("The exam grade is " + curvedExam.getGrade());
   }
}