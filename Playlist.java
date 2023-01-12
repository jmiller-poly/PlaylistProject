import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    //fields//

    ArrayList<Song> songs;

    //constructor//
    
    public Playlist() {
        ArrayList<Song> songs = new ArrayList<Song>();
    }

    //methods//

    /*
     * Prints out every song in the playlist
     */
    public void printSongList() {
        int index = 1;
        for(Song s : songs) {
            System.out.println(index + " | " + s.toString());
            index++;
        }
    }

    /*
     * Internal function to check if a given position is valid
     */
    private boolean indexCheck(int pos) {
        if(pos-2 < songs.size()) {
            return true;
        } else {
            System.out.println("Invalid index.");
            return false;
        }
    }

    /*
     * Likes or unlikes a song
     */
    public void likeSong(int position) {
        boolean valid = indexCheck(position);
        if(valid == true){
            songs.get(position).like(); //position as dictated by the printSongList method is always 1 more than the true index
        }
    }

    /*
     * Adds a new song to the playlist given the information for the song
     */
    public void addSongWithInfo(String title, String author, int length) {
        Song song = new Song(title, author, length);
        songs.add(song);
    }

    /*
     * Adds a new song given the song as an object
     */
    public void addSong(Song s) {
        songs.add(s);
    }

    /*
     * Removes a song from the playlist
     */
    public void removeSong(int position) {
        boolean valid = indexCheck(position);
        if(valid == true) {
            songs.remove(position);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void printLikedSongs() {
        for(Song s : songs) {
            if(s.isLiked()) {
                System.out.println(s);
            }
        }
    }

    public String totalDuration() {
        int length = 0;
        for(Song s : songs) {
            length += s.getLength();
        }

        String sLen = "";
        int min = length/60;
        int sec = length%60;
        sLen += min;
        sLen += ":";
        if(sec < 10) { //Necessary to format, otherwise lengths with seconds fewer than 10 could look something like 4:2 instead of 4:02
            sLen += "0";
        }
        sLen += sec;
        return sLen;
    }

    public void removeUnliked() {
        for(int i = 0; i < songs.size(); i++) {
            if(!(songs.get(i).isLiked())) {
                songs.remove(i);
                i--;
            }
        }
    }
}
