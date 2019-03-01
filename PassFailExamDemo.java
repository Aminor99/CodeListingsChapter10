//Name: Asia Minor
//Date: 2-27-19
//Purpose: code listing 10.23, this program demonstrates the pass fail exam class
import java.util.Scanner;

public class PassFailExamDemo{
   public static void main(String[] args){
      int questions; //number of questions
      int missed; //number of questions missed
      double minPassing; //minimum passing score
      //create a scanner object
      Scanner keyboard = new Scanner(System.in);
      //get the number of questions on the exam
      System.out.print("How many questions are on the exam?");
      questions = keyboard.nextInt();
      //get the number of questions missed
      System.out.print("How many questions did the student miss?");
      missed = keyboard.nextInt();
      //get the minimum passing score
      System.out.print("What is the minimum passing score?");
      minPassing = keyboard.nextDouble();
      //create a passfailing object
      PassFailExam exam = new PassFailExam(questions, missed, minPassing);
      //display the points for each question
      System.out.println("Each question counts " + exam.getPointsEach() + " points.");
      //display the exam score
      System.out.println("The score is " + exam.getScore());
      //display the exam grade
      System.out.println("The exam grade is " + exam.getGrade());
   }
}