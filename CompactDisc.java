//Name: Asia Minor
//Date: 3-1-19
//Purpose: code listing 10.39, compact disc class
public class CompactDisc implements RetailItem{
   private String title; //the cds titles
   private String artist; // the cds artist
   private double retailPrice; //the cds retail price
   //constructor
   //@param cdTitle, the cd title
   //@param cdArtist, the name of the artist
   //@param cdPrice, the cd's price
   public CompactDisc(String cdTitle, String cdArtist, double cdPrice){
      title = cdTitle;
      artist = cdArtist;
      retailPrice = cdPrice;
   }
   //getTitle method
   //@return the cds title
   public String getTitle(){
      return title;
   }
   //getArtistmethod
   //@return teh name of the artist
   public String getArtist(){
      return artist;
   }
   //getRetailPrice method, required by the retailItem interface
   //@return the retail price of the cd
   public double getRetailPrice(){
      return retailPrice;
   } 
}