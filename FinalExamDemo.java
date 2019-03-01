//Name: Asia Minor
//Date: 2-26-19
//Purpose: code listing 10.4, this program demonstrates the final exam class, which extends the
         //graded activity class
 import javax.swing.JOptionPane;
 
public class FinalExamDemo{
   public static void main(String[] args){
      String input; // to hold input
      int questions; // number of questions
      int missed; //number of questions missed
      //get the number of questions on the exam
      input = JOptionPane.showInputDialog("How many questions are on the exam?");
      questions = Integer.parseInt(input);
      //get the number of questions the student missed
      input = JOptionPane.showInputDialog("How many questions did the student miss?");
      missed = Integer.parseInt(input);
      //create a final exam object
      FinalExam exam = new FinalExam(questions, missed);
      //display the test results
      JOptionPane.showMessageDialog(null, "Each question counts " + exam.getPointsEach() + " points." +
      "\nThe exam score is " + exam.getScore() + "\nThe exam grade is " + exam.getGrade());
      
      System.exit(0);
   }
}
