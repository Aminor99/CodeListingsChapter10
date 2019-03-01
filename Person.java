//Name: Asia Minor
//Date: 2-27-19
//Purpose: code listing 10.30, introduction to implementation
public class Person implements Displayable{
   private String name;
   //consturctor
   public Person(String n){
      name = n;
   }
   //display method
   public void display(){
      System.out.println("My name is " + name);   
  }
}