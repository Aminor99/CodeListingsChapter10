//Name: Asia Minor
//Date: 3-1-19
//Purpose: code listing 10.40, dvd movie class
public class DvdMovie implements RetailItem{
   private String title; //the dvds title
   private int runningTime; //running time in minutes
   private double retailPrice; //the dvds retail price
   //constructor
   //@param dvdTitle, the dvd title
   //@param runtime, the running time in minutes
   //@param dvdPrice, the dvds price
   public DvdMovie(String dvdTitle, int runTime, double dvdPrice){
      title = dvdTitle;
      runningTime = runTime;
      retailPrice = dvdPrice;
   }
   //getTitle method
   //@return the dvds title
   public String getTitle(){
      return title;
   }
   //getRunningTime method
   //@return the running time in minutes
   public int getRunningTime(){
      return runningTime;
   }
   //getRetailPrice method, required by the retailitem interface
   //@return the retaile price of the dvd
   public double getRetailPrice(){
      return retailPrice;
   }
}