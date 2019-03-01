//Name: Asia Minor
//Date: 2-27-19
//Purpose: code listing 10.21, this calls holds a numeric score and determines whether the score is passing or falling
public class PassAllActivity extends GradedActivity{
   private double miniPassingScore; //minimum passing score
   //the constructor sets the minimum passing score
   //@param mps, the minimum passing score
   public PassAllActivity(double mps){ //i made a typo and didnt notice untill i compiled it
      miniPassingScore = mps;
   }
   //the getGrade method returns a letter grade determined from the score field. this method overrides the superclass method
   //@return the letter grade
   @Override
   public char getGrade(){
      char letterGrade;
      
      if (super.getScore() >= miniPassingScore)
         letterGrade = 'P';
      else
         letterGrade = 'F';
       
     return letterGrade;
   }
}