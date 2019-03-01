//Name: Asia Minor
//Date: 3-1-19
//Purpose: code listing 10.41, the program demonstrates that an interface type may be used to create a polymorphic reference
public class PolymorphicInterfaceDemo{
   public static void main(String [] args){
      //cretae a compactdisc object
      CompactDisc cd = new CompactDisc("Greatest Hits", "Joe Looney Band", 18.95);
      //create a dvdmovie object
      DvdMovie movie = new DvdMovie("Wheels of Fury", 137, 12.95);
      //display the CD's title
      System.out.println("Item #1: " + cd.getTitle());
      //display the cds price
      showPrice(cd);
      //display the dvds title
      System.out.println("Item #2: " + movie.getTitle());
      //display the dvds price
      showPrice(movie);
   }
   //the showprice method displays he price of thr retailitem object
   //@param item, a reference to a retailitem object
   private static void showPrice(RetailItem item){
      System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
   }
}