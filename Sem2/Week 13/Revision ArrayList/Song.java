import java.util.ArrayList;

public class Song
{
   private String title;
   private String artist;
   private int duration;
   
   public Song(String artistIn, String titleIn, int secondsIn)
   {
      title=titleIn;
      artist=artistIn;
      duration=secondsIn;
   }
   
   //Accessor methods
   public String getArtist()
   {
      return artist;
   }
   
   public double getStorage()
   {
      //assume each minute of sound needs 1mb of storage space
      return (double) duration/60;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public int getDuration()
   {
      return duration;
   }
   
   
}