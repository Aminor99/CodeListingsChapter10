//Name: Asia Minor
//Date: 2-26-19
//Purpose: code listing 10.19,  this class determines the grade for a final exam
//the numeric score is rounded up to the next whole numer if its fraction part is 
//.5 or greater
public class FinalExam2 extends GradedActivity2{
   private int numQuestions; // number of questions
   private double pointsEach; // points for each question
   private int numMissed; // number of questions missed
   //the constructor sets the number of questions missed on the exa, and the number of questions missed
   //@param questions, the number of questions
   //@param missed, the number of questions missed
   public FinalExam2(int questions, int missed){
      double numericScore; //to hold a numeric score
      //set the numQuestions and numMissed fields
      numQuestions = questions;
      numMissed = missed;
      //calculate the points for each questions and the numeric score for this exam
      pointsEach = 100.0/questions;
      numericScore = 100.0 - (missed * pointsEach);
      //call the inherited setScore method to se the numeric score
      setScore(numericScore);
      //adjust the score
      adjustScore();
   }
   //the getPointEach method returns the number of points each question is worth
   //@return the value in the pointsEach field
   public double getPointsEach(){
      return pointsEach;
   }
   //the getNumMissed method returns the number of questions missed
   //@return the value in the numMissed field
   public int getNumMissed(){
      return numMissed;
   }
   //the adjustScore method adjusts a numeric score if score is within .5 points of the next whole
   //number, it rounds the score up
   private void adjustScore(){
      double fraction;
      //get the fractoinal part of the score
      fraction = score - (int) score;
      //if the fractional part is .5 or greater, round the score up to the next whole number
      if (fraction >= .5)
         score = score + (1.0 - fraction);
   }
   
}