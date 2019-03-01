//Name: Asia Minor
//Date: 2-27-19
//Purpose: code listing 10.24, this program demonstrates the toString and equeals methods that are
//inherited from the object class
public class ObjectMethods{
   public static void main(String [] args){
      //create two objects
      PassFailExam exam1 = new PassFailExam(0, 0, 0);
      PassFailExam exam2 = new PassFailExam(0, 0, 0);
      //send the objects to println, which will call the toString method
      System.out.println(exam1);
      System.out.println(exam2);
      //test the equaks method
      if (exam1.equals(exam2))
         System.out.println("They are the same.");
      else 
         System.out.println("They are not the same.");
   }
}