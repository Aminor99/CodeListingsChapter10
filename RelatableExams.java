//Name: Asia Minor
//Date: 3-1-19
//Purpose: code listing 10.34, this program demonstrates the finalexam 3 class implements the relatbale interface
public class RelatableExams{
   public static void main(String[] args){
      //exam #1 had 100 questions and the student missed 20 
      FinalExam3 exam1 = new FinalExam3(100, 20);
      //exam #2 had 100 questions and the student missed 30
      FinalExam3 exam2 = new FinalExam3(100, 30);
      //display exam scoes
      System.out.println("Exam 1: " + exam1.getScore());
      System.out.println("Exam 2: " + exam2.getScore());
      //compare the exam score
      if(exam1.equals(exam2))
         System.out.println("The exam scores are equal");
      if(exam1.isGreater(exam2))
         System.out.println("The Exam 1 score is the highest");
      if(exam1.isLess(exam2))
         System.out.println("The Exam 1 score is the lowest");
   }
}