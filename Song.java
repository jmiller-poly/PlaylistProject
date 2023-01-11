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

     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */


}
