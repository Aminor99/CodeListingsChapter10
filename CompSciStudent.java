//Name: Asia Minor
//Date: 2-27-19
//Purpose: code listing 10.27, this class holds data for a computer science student
public class CompSciStudent extends Student{
   //requre fields
   private final int MATH_HOURS = 20; //math hour
   private final int CS_HOURS = 40; //comp sci hours
   private final int GEN_ED_HOURS = 60; // gen ed hours
   //hours taken
   private int mathHours; // math hours taken
   private int csHours; //comp sci hours taken
   private int genEdHours; // general ed hours tkae
   //the constructor sets the students name, id number, and the year admitted
   //@param n, the students name
   //@param id, the students id number
   //@param year, the year the student was admitted
   public CompSciStudent(String n, String id, int year){
      super(n, id, year);
   }
   //the setMathHours method sets the number of math hours taken
   //@param math, the math hours taken
   public void setMathHours(int math){
      mathHours = math;
   }
   //the setCsHours method sets the number of computer science hours taken
   //@param cs, the computer science hours take
   public void setCsHours(int cs){
      csHours = cs;
   }
   //the setGenEdHours method sets the number of general ed hours take
   //@param genEd, the general ed hours taken
   public void setGenEdHours(int genEd){
      genEdHours = genEd;
   }
   //the getRemaingHoursmethod returns the number of hours remaining to be taken
   //@return the hours remaining for the student
   @Override      //the method of the same name was abstract in the superclass
   public int getRemainingHours(){
      int reqHours, remainingHours; // required hours and remaining hours
      //calculate the required hours
      reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
      //calculate the remaining hours
      remainingHours = reqHours - (mathHours + csHours + genEdHours);
   return remainingHours;   
   }
   //the toSting method returns a string containing the students data
   //@return a reference to a String
   @Override
   public String toString(){
      String str;
      str = super.toString() + "\nMajor: Computer Science \nMath Hours Taken: " + mathHours + "\nComputer Science" +
      " Hours Taken: " + csHours + "\nGeneral Ed Hours Taken: " + genEdHours;
      return str;
   }
}
