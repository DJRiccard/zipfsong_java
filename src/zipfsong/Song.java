package zipfsong;

public class Song implements Comparable<Song> {
	private int played;
	private String  name;
	private float  placeValue;
	private float quality; 
	
	public void setPlayedSong(int p) {
	  	played = p;  	
	}
	
	public void setNameSong(String n) {
	  	name = n; 	
	}
	
	public void setPVSong(float pV) {
	  	placeValue = pV;
	}
	
	public void setQualitySong(float q) {
	  	quality = q;	  	
	}
	
	public int getPlayedSong() {
	  return played; 
	}
	
	public String getNameSong() {
	  return name; 
	}
	
	public float getPVSong() {
	  return placeValue; 
	}
	
	public float getQualitySong() {
	  return quality; 
	}
	
	@Override
	public int compareTo(Song o) {
		 if (quality > o.quality) return -1;
		 if (quality < o.quality) return 1;
		 return 0;
	}
	
}

