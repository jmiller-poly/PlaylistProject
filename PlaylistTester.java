/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author James Miller
 * @version 1/18/23
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        Playlist p1 = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        p1.addSong(new Song("Imagine", "John Lennon", 233));
        p1.addSong(new Song("Bohemian Rhapsody", "Queen", 359));
        p1.addSong(new Song("Sympathy for the Devil", "The Rolling Stones", 382));

        System.out.println("Printing the songs...\n");
        p1.printSongList();

        System.out.println("\nLiking the songs in position 1, 2, \n");
        p1.likeSong(1);
        p1.likeSong(2);

        System.out.println("Printing the songs...\n");
        p1.printSongList();

        System.out.println("\nRemoving the song in position 2 \n");
        p1.removeSong(2);

        System.out.println("Printing the songs...\n");
        p1.printSongList();

        System.out.println("\nPrinting only the liked songs...\n");
        p1.printLikedSongs();

        System.out.println("\nPrinting the total duration of all songs...\n");
        System.out.println(p1.totalDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        p1.removeUnliked();

        System.out.println("Printing all songs...\n");
        p1.printSongList();
    }
}
