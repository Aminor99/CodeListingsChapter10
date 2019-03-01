//Name: Asia Minor
//Date: 2-26-19
//Purpose: code listing 10.13, this class computes a curved grade. 
//it extends the GradedActivity class
public class CurvedActivity extends GradedActivity{
   double rawScore; //unadjusted score
   double percentage; //curve percentage
   //the constructor sets the cirve percentage
   //@param percent, the curve percentage
   public CurvedActivity(double percent){
      percentage = percent;
      rawScore = 0.0;
   }
      //the setScore method overrides the superclass setScore method
      //this version accepts the unadjusted score as an argument. that score is multplied
      //by the superclass's setScore method
      //@param s, the unadjusted score
   @Override
      public void setScore(double s){
      rawScore = s;
      super.setScore(rawScore * percentage);
   }
      //the getRawScore method returns the raw score
      //@return the value in the rawScore field
   public double getRawScore(){
      return rawScore;
   }
      //the getPercentage method returns the curve percentage
      //@return the value in the percentage field
   public double getPercentage(){
      return percentage;
   }
}
