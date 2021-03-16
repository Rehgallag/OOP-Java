import java.util.*;

public class SongTester
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      ArrayList <Song> songList = new ArrayList<Song>();
      
      songList.add(new Song("Mike Morasky", "Rocket Jump Waltz", 39));
      songList.add(new Song("Electric Light Orchestra", "Mr. Blue Sky", 303));
      
      System.out.println("Artist "+"\t\tTitle");
      for(Song s: songList)
      {
         System.out.println(s.getArtist() + "\t" +s.getTitle());
      }
      
      int count = 0;
      for(Song s: songList)
      {
         if(s.getStorage()>3.5)
            count++;
      }
      System.out.println("Total songs over 3.5mb: " + count);
      
      double total = 0;
      for(Song s: songList)
      {
         if(s.getStorage()>3.5)
         {
            total+=s.getStorage();
         }
         System.out.println("Total storage needed to hold all songs: " + total);
      }
      
      String input;
      boolean found = false;
      if(songList.isEmpty())
         System.out.println("There are no songs in the List");
      else
      {
         System.out.println("Enter a song to remove: ");
         input = in.nextLine();
         for(Song s: songList)
         {
            if(s.getTitle().equals(input))
            {
               found = true;
               songList.remove(songList.indexOf(s));
               break;
            }
         }
         if(found==true)
            System.out.println("Song " + input + " removed");
         else
            System.out.println("Song is not in the list");
      }
   }
}