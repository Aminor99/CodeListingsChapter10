//Name: Asia Minor
//Date: 2-26-19
//Purpose: code listing 10.12, this class holds data about a cube
public class Cube extends Rectangle{
   private double height; //the cubes height
   //the constructor sets the cubes length width, and height
   //@param len, the cubes length
   //@param w, the cubes width
   //@param h, the cubes height
   public Cube(double len, double w, double h){
      //calls the superclass constructor
      super(len, w);
      //sets the height
      height = h;
   }
   //the getHeight method returns the cubes height
   //@return the value in the height field
   public double getHeight(){
      return height;
   }
   //the getSurface method calculates and returns the cubes surface area
   //@return the surface area of the cube
   public double getSurfaceArea(){
      return getArea() * 6;
   }
   //the getVolume method calculates and returns the cibes volume
   //@return the volume of the cube
   public double getVolume(){
      return getArea() * height;
   }
}
