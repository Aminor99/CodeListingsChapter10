//Name: Asia Minor
//Date: 2-27-19
//Purpose: code listing 10.22, this class determines a passing or failing grade for an exam
public class PassFailExam extends PassAllActivity{ //i made a typo in the superclass :/
   private int numQuestions; //number of questions
   private double pointsEach; //points for each questions
   private int numMissed; //number of question missed
   //te constructor sets the number of questions, the number of questions missed, and the minimum passing score
   //@param questions, the number of questions
   //@param missed, the number of questions missed
   //@param minPassing, the minimum passing score
   public PassFailExam(int questions, int missed, double minPassing){
      //call the superclass constructor
      super(minPassing);
      //declare a local vairale for the score
      double numericScore;
      //set the numQuestions and numMissed fields
      numQuestions = questions;
      numMissed = missed;
      //calculate the points for each question and the numeric score for the exan
      pointsEach = 100.0/questions;
      numericScore = 100.0 - (missed * pointsEach);
      //call the superclass' setScre method to set the numeric score
      setScore(numericScore);
   }
   //the getPointsEach method returns the number of points each question is orth
   //@return the value in the pointsEach field
   public double getPointsEach(){
      return pointsEach;
   }  
   //the getNumMissed method returns the number of questions missed
   //@return the value in the numMussed field
   public int getNumMussed(){
      return numMissed;
   }
}