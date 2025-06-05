public class MusicLibraryDemo {

        public static void main(String[] args) {
            MusicLibrary library = new MusicLibrary();

            Song s1 = new Song("Imagine", "John Lennon");
            Song s2 = new Song("Imagine", "John Lennon"); // Gleicher Inhalt wie s1
            Song s3 = new Song("Let It Be", "The Beatles");
            Song s4 = new Song("Hey Jude", "The Beatles");
            Song s5 = new Song("Imagine", "A Perfect Circle"); // Gleicher Titel, anderer Artist

            library.addSong(s1);
            library.addSong(s2); // Sollte nicht doppelt auftauchen, wenn equals & hashCode korrekt sind
            library.addSong(s3);
            library.addSong(s4);
            library.addSong(s5);

            System.out.println("== Alle Songs von John Lennon ==");
            library.printSongsByArtist("John Lennon");

            System.out.println("\n== Alle Songs von The Beatles ==");
            library.printSongsByArtist("The Beatles");

            System.out.println("\n== Entferne Song: Let It Be ==");
            boolean removed = library.removeSong(s3);
            System.out.println("Erfolgreich entfernt? " + removed);

            System.out.println("\n== Alle Songs von The Beatles nach Entfernen ==");
            library.printSongsByArtist("The Beatles");
        }
    }

