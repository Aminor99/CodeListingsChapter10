//Name: Asia Minor
//Date: 2-26-19
//Purpose: code listing 10.20, this program demonstrates the finalexam2 class, which
//extends the gradedactivity2 class
import javax.swing.JOptionPane;
public class ProtectedDemo{
   public static void main(String[] args){
      String input; //to hold input
      int questions; //number of questions
      int missed; //number of questions missed
      //get the number of questions on the exam
      input = JOptionPane.showInputDialog("How many questions are on the final exam?");
      questions = Integer.parseInt(input);
      //get the number of questions the student missed
      input = JOptionPane.showInputDialog("How many questions did the student miss?");
      missed = Integer.parseInt(input);
      //creates a finalexam object
      FinalExam2 exam = new FinalExam2(questions, missed);
      //display the test results
      JOptionPane.showMessageDialog(null, "Each questions counts " + exam.getPointsEach() + " points."
         + "\nThe exam grade is " + exam.getGrade());
      
      System.exit(0);
   }
}