package zipfsong;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;

public class SongTester {
	public static void main (String[] args) {
		ArrayList<Song> numberofSongssArray = new ArrayList<Song>();
		int totPlayed = 0;
		int totSongs = Constants.getInstance().getTotSongs();

		for (int i=1;i<=totSongs;i++) {
			float j = 1;
			Random randomGenerator = new Random();
			int randomInt =  randomGenerator.nextInt((int) Math.pow(10,12));//randomGenerator.nextInt(1012);
			totPlayed += randomInt;
			float placeValue = 1/j;
			Song s = new Song();
			s.setNameSong("Track" + i);
			s.setPlayedSong(randomInt);
			s.setPVSong(placeValue);
		    numberofSongssArray.add(s);
		    j++;
		 }
		 
		 for (int i=0;i<totSongs;i++) {
			 float q = numberofSongssArray.get(i).getPlayedSong() / (totPlayed * numberofSongssArray.get(i).getPVSong());
			 numberofSongssArray.get(i).setQualitySong(q);
		 }
		 
		 System.out.println("Songs\tSelect");
		 System.out.println(Constants.getInstance().getTotSongs() + "\t" + Constants.getInstance().getSelectSongs());
		 
		 System.out.println("");
		 System.out.println("Played\tName"); 
		 for (int i=0;i<totSongs;i++) {
			 System.out.println(numberofSongssArray.get(i).getPlayedSong() + "\t" + numberofSongssArray.get(i).getNameSong());
		 }
		 System.out.println("");
		 
		 Collections.sort(numberofSongssArray);
		 printList(numberofSongssArray);

	  }
	
	private static void printList(List<Song> list) {
		int i = 0;
		int selectSongs = Constants.getInstance().getSelectSongs();
		System.out.println("The most quality songs"); 
		for (Song e: list) { 
			System.out.println(e.getNameSong()); 
			i++;
			if (i == selectSongs)
				break;
		}
		
	}
}

