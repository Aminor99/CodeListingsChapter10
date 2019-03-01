//Name: Asia Minor
//Date: 2-27-19
//Purpose: code listing 10.33, ths class determines the grade for the final exam
public class FinalExam3 extends GradedActivity implements Relatable{
   private int numQuestions; //number of questions
   private double pointsEach; //points for each question
   private int numMissed; //questions missed
   //the constructor sets the number of questions on the exam and the number of questoins missed
   //@param questions, the number of number of questions
   //@param missed, the number of questions missed
   public FinalExam3(int questions, int missed){
      double numericScore; //to hold a numeric score
      //set the numQuestions and numMissed fields
      numQuestions = questions;
      numMissed = missed;
      //caluculate the points for each questin an the numeric score for this exam
      pointsEach = 100.0 /questions;
      numericScore = 100.0 - (missed* pointsEach);
      //call the inherited setscore method to set the numeric score
      setScore(numericScore);
   }  
   //the getpointseach method return the number of points each question is worth
   //@return the value in the pointseach field
   public double getPointsEach(){
      return pointsEach;
   }
   public int getNumMissed(){
      return numMissed;
   }
   //the equals method method compares the calling objects to the argument for equality
   //@return true if the calling objetcs score is equal to the arguments score
   public boolean equals(GradedActivity g){
      boolean status;
      if(this.getScore() == g.getScore())
         status = true;
      else
         status = false;
      return status;      
   }
   //the isGreater method dtermine whether the calling object is greater than the arguments object
   //@return true if the calling objects score is greater than the argument objects score
   public boolean isGreater(GradedActivity g){
      boolean status;
      if (this.getScore() > g.getScore())
         status = true;
      else
         status = false;
      return status;
   }
   //the isLess method determines whether the calling object is less than the argument object
   //@eturn true if the objects scoreless than the argument objects score
   public boolean isLess(GradedActivity g){
      boolean status;
      if (this.getScore() < g.getScore())
         status = true;
      else
         status = false;
      return status;
   }
}