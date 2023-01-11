/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //fields//
    String title; //Title of the song
    String author; //The author of the song
    int length; //The length of the song in seconds, will need to be converted into minute form later
    boolean liked; //Whether the song is "liked" or not


    //constructors//
    public Song(String sTitle, String sAuthor, int sLength, boolean sLiked) {
        title = sTitle;
        author = sAuthor;
        length = sLength;
        liked = sLiked;
    }

    public Song(String sTitle, String sAuthor, int sLength) { //most likely, if the song is liked will not be specified, so it will default to false
        title = sTitle;
        author = sAuthor;
        length = sLength;
        liked = false;
    }

    //methods//
    
    /*
     * Returns the title of the song
     */
    public String getTitle() {
        return title;
    }

    /*
     * Returns the author of the song
     */
    public String getAuthor() {
        return author;
    }

    /*
     * returns the length in raw seconds
     */
    public int getLength() {
        return length;
    }

    /*
     * Converts the length of the song from seconds to a standard minute:second format
     */
    public String getLengthMinutes() {
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

    /*
     * Returns if the song is liked
     */
    public boolean isLiked() {
        return liked;
    }

    /*
     * Inverts the "liked" status, if the song was previously unliked, it is now liked. Otherwise, it is now unliked. 
     */
    public void like() {
        liked = !liked; 
    }

    /*
     * Returns a string with the following information about the song: Title, Author, Length, Liked
     */
    public String toString() {
        if(liked == true) {
            return "\"" + title + "\"" + " by " +  author + " (" + getLengthMinutes() + ") -- liked";
        }
        else {
            return "\"" + title + "\"" + " by " +  author + " (" + getLengthMinutes() + ")";
        }
    }
}
