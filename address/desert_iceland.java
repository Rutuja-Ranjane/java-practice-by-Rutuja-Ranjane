import java.util.Arrays;
import java.util.ArrayList;
class Playlist {
  public static void main(String []args)
  {
     String[] favoriteSongs = {
          "Queen - Bohemian Rhapsody",
          "The Beatles - Hey Jude",
          "Nirvana - Smells Like Teen Spirit",
          "Adele - Rolling in the Deep",
          "Michael Jackson - Billie Jean",
          "Beyoncé - Crazy In Love",
          "Ed Sheeran - Shape of You",
          "Taylor Swift - Blank Space",
          "Billie Eilish - Bad Guy",
          "Bruno Mars - Uptown Funk"};

       System.out.println("First three favorite songs:");
       for (int i = 0; i < 3; i++) {
         System.out.println(favoriteSongs[i]);
       }
      ArrayList<String> desertIslandPlaylist = new ArrayList<>();

      desertIslandPlaylist.add("Coldplay - Fix You");
      desertIslandPlaylist.add("Linkin Park - In the End");
      desertIslandPlaylist.add("Ariana Grande - Thank U, Next");
      desertIslandPlaylist.add("The Weeknd - Blinding Lights");
      desertIslandPlaylist.add("Dua Lipa - Don't Start Now");

      System.out.println("Desert Island Playlist:");
      System.out.println(desertIslandPlaylist);

      desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
      System.out.println("Number of songs in desertIslandPlaylist: " + desertIslandPlaylist.size());

      while (desertIslandPlaylist.size() > 10) {
        desertIslandPlaylist.remove(desertIslandPlaylist.size() - 1); 
      }

       System.out.println("Updated Desert Island Playlist (Top 10):");
       System.out.println(desertIslandPlaylist);

       int songA = desertIslandPlaylist.indexOf("Adele - Rolling in the Deep");
       int songB = desertIslandPlaylist.indexOf("Queen - Bohemian Rhapsody");
       String tempA = desertIslandPlaylist.get(songA);
       desertIslandPlaylist.set(songA, desertIslandPlaylist.get(songB));

        System.out.println("Playlist after replacing Song A with Song B:");
        System.out.println(desertIslandPlaylist);

        desertIslandPlaylist.set(songB, tempA);
        System.out.println("Final Desert Island Playlist after swapping:");
        System.out.println(desertIslandPlaylist);
  }
}