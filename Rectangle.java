//Name: Asia Minor
//Date: 2-26-19
//Purpose: rectangle clas needed for code listing 10.11
public class Rectangle{
   private double length;
   private double width;
   //constructor 
   //@param len, the length of the rectangle
   //@param w, the width of the rectangle
   public Rectangle(double len, double w){
      length = len;
      width = w;
   }
   public void setLength(double l){
      length = l;
   }
   public void setWidth(double w){
      width = w;
   }
   public double getLength(){
      return length;
   }
   public double getWidth(){
      return width;
   }
   public double getArea(){
      return length * width;
   }
}