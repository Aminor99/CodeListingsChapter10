//Name: Asia Minor
//Date: 2-26-19
//Purpose: code listing 10.18, a class that holds a grade for the graded activity
public class GradedActivity2{
   protected double score; //numeric score
   //the setScore method sets the score field
   //@param s, the value to store in score
   public void setScore(double s){
      score = s;
   }
   //the getScore method returns the score
   //@return the value stored in the score field
   public double getScore(){
      return score;
   }
   //the getGrade method returns a letter grade determined from the score field
   //@return the letter grade
   public char getGrade(){
      char letterGrade;
      if (score >= 90)
         letterGrade = 'A';
      else if (score >= 80)
         letterGrade = 'B';
      else if (score >= 70)
         letterGrade = 'C';
      else if (score >= 60)
         letterGrade = 'D';
      else
         letterGrade = 'F';
         
      return letterGrade;
   }
}