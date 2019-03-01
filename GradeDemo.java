//Name: Asia Minor
//Date: 2-26-19
//Purpose: code listing 10.3, the class determines the grade for a final exam

public class FinalExam extends GradedActivity{
   private int numeQuestions; //number of questions
   private double pointsEach; //points for each quesion
   private int numMissed; //questions missed
   //the constructor sets the number of questoins on the exam and the number of questions missed
   //@param questions, the number of questions
   //@param missed, the numbers of questions missed
   public FinalExam(int questions, int missed){
      double numericScore; //to hold a numeric score
      //set the numQuestions and numMissed fields
      numQuestions = questions;
      numMissed = missed;
      //calculate the point for each question and the numeric coe for the exam
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed*pointsEach);
      //call the inherited setScore method to se the numeric score
      setScore(numericScore);
      //the getPointsEach method returns the number of points each question is worth
      //@return the value in the pointsEach field
      public double getPointsEach(){
         return pointsEach;
      }
      //the getNumMissed method returns the number of questions missed
      //@return the value in the numMissed field
      public int getNumMissed(){
         return numMissed;
      }
   }
}