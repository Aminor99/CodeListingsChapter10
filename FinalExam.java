//Name: Asia Minor
//Date: 2-26-19
//Purpose: code listing 10.3, this class determines the grade for a final exam
 
public class FinalExam extends GradedActivity{
   private int numQuestions; //number of questions
   private double pointsEach; //points for each question
   private int numMissed; //questions missed
   //the constructor sets the number of questions on the exam and the number of questoins missed
   //@param question, the number of questoins
   //@param missed, the number of questoins missed
   public FinalExam(int questions, int missed){
      double numericScore; //to hold a numeric score
      //set the numQuestions and numMissed fields
      numQuestions = questions;
      numMissed = missed;
      //calculate the points for each question and the numeric scor for this exam
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);
      //call the inherited setScore method to set the numeric score
      setScore(numericScore);
   }
   public double getPointsEach(){
      return pointsEach;
   }
   //the getNumMissed method returns number of question missed
   //@return the value in the numMissed field
   public int getMissed(){
      return numMissed;
   }
} 