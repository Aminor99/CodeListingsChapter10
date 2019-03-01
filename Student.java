//Name: Asia Minor
//Date: 2-27-19
//Purpose: code listing 10.26, the student class is an abstract class that holds general data about a student. classes representing
//specific types of data of students should inherit frmo this class
public abstract class Student{
   private String name; //student name
   private String idNumber; //student id
   private int yearAdmitted; //year admitted
   //the constructor sets the students name. id number, and year admitted
   //@param n, the students name
   //@param id, this students id number
   //@param year, the year the student was admistted
   public Student(String n, String id, int year){
      name = n;
      idNumber = id;
      yearAdmitted = year;
   }
   //the toString method returns a String containing the students data
   //@return A reference to a String
   public String toString(){
      String str;
      str = "Name: " + name + "\nID Number: " + idNumber + "\nYear Admitted: " + yearAdmitted;
      return str;
      //the getRemainingHours method is abstract. it must be overriden in a subclass
      //@return the hours remaining for the student
   }
   public abstract int getRemainingHours();
}
