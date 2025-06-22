public class MusicLibraryDemo {
    public static void main(String[] args) {

        MusicLibrary library = new MusicLibrary();
        Song songJay = new Song("Das ist real","Jay");
        Song s1 = new Song("Shape of You", "Ed Sheeran");
        Song s2 = new Song("Perfect", "Ed Sheeran");
        Song s3 = new Song("Believer", "Imagine Dragons");
        Song s4 = new Song("Thunder", "Imagine Dragons");

        Song s5 = new Song("Believer", "Imagine Dragons");

        library.addSong(songJay);
        library.addSong(s1);
        library.addSong(s2);
        library.addSong(s3);
        library.addSong(s4);
        library.addSong(s5);

        library.addSong(new Song("Funko","Funk King"));

        library.printSongsByArtist();

        library.removeSong(songJay);
        library.removeSong(new Song("Funko","Funk King"));

        System.out.println("Nach dem Löschen");
        library.printSongsByArtist();

    }
}
