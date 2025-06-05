import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MusicLibrary {
    private Set<Song> songs;

    private final Map<String, Set<Song> > songsByArtist;

    public MusicLibrary() {
     songs = new HashSet<>();
     songsByArtist = new HashMap<>();
    }

    public void addSong(Song song) {
        if (songs == null) {
            throw new IllegalArgumentException("No songs");
        }
        songs.add(song);

        String artist = song.getArtist();
        songsByArtist.putIfAbsent(artist, new HashSet<>());
        songsByArtist.get(artist).add(song);
    }

    public Set<Song> getSongsByArtist(String artist) {
        if (artist == null || !songsByArtist.containsKey(artist)) {
            return Set.of(); // oder: Collections.emptySet();
        }
        return songsByArtist.get(artist);
    }

    public boolean removeSong(Song song) {
        if (!songs.contains(song)) {
            throw new IllegalArgumentException("No such song");
        }

        songs.remove(song);

        Set<Song> artistSongs = songsByArtist.get(song.getArtist());
        if (artistSongs != null) {
            artistSongs.remove(song);
            if (artistSongs.isEmpty()) {
                songsByArtist.remove(song.getArtist());
            }
        }

        return true;
    }

    public void printSongsByArtist(String artist) {
        Set<Song> artistSongs = songsByArtist.get(artist);

        if (artistSongs == null || artistSongs.isEmpty()) {
            System.out.println("Keine Songs für " + artist);
            return;
        }

        System.out.println("Songs von " + artist + ":");
        for (Song song : artistSongs) {
            System.out.println(" - " + song.getTitle());
        }
    }

}

