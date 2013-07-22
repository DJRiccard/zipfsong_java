package zipfsong;

public class Constants {
    private static Constants instance;

    private int selectSongs;
    private int totSongs;

    private Constants() {
        selectSongs = 3;
        totSongs = 50000;
    }

    public static Constants getInstance() {
        if (instance == null) {
            instance = new Constants();
        }
        return instance;
    }

    public int getSelectSongs() {
    	return selectSongs;
    }
    
    public int getTotSongs() {
    	return totSongs;
    }
}