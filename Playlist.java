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
            System.out.println("Invalid index");
            return false;
        }
    }


    public void likeSong(int position) {
        boolean valid = indexCheck(position);
        if(valid == true){
            songs.get(position).like(position-1); //position as dictated by the printSongList method is always 1 more than the true index
        }
    }


     /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
}
