//Name: Asia Minor
//Date: 3-1-19
//Purpose: code listing 10.35, defualt methods in inerfaces
public interface Displayable2{
   default void display(){
      System.out.println("This is the default display method");
   }
}