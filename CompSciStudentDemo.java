//Name: Asia Minor
//Date: 2-27-19
//Purpose: code listing 10.28 this program demonstrates the compsci student class
public class CompSciStudentDemo{
   public static void main(String [] args){
      //creater a compsciestudent object
      CompSciStudent csStudent = new CompSciStudent("Jennifer Haynes", "167W98337", 2015);
      //store values for math, cs, and gen ed hours
      csStudent.setMathHours(12);
      csStudent.setCsHours(20);
      csStudent.setGenEdHours(40);
      //display the students data
      System.out.println(csStudent);
      //display the number of remaining hours
      System.out.println("Hours remaining: " + csStudent.getRemainingHours());
   }
}