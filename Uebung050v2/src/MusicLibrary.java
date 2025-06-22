import javax.print.DocFlavor;
import java.util.*;

public class MusicLibrary {

    Set<Song> songs;
    Map<String,Set<Song>> songsByArtist;

    public MusicLibrary(){
        songs = new HashSet<>();
        songsByArtist = new HashMap<>();

    }

    public void addSong(Song song){
        songs.add(song);

        if(songsByArtist.containsKey(song.getArtist())){
            for(String artist:songsByArtist.keySet()){
                if (artist.equals(song.getArtist())){
                    songsByArtist.get(artist).add(song);
                }
            }
        }else {
            Set<Song> temp =new HashSet<>();
            temp.add(song);
            songsByArtist.put(song.getArtist(), temp);
        }
    }

    public Set<Song> getSongsByArtist(String artist){
        return songsByArtist.getOrDefault(artist,Collections.emptySet());
    }

    public boolean removeSong(Song song){

        boolean completetd = songs.remove(song) && songsByArtist.get(song.getArtist()).remove(song);
        if (songsByArtist.get(song.getArtist()).isEmpty()){
            songsByArtist.remove(song.getArtist());
        }
        return completetd;
    }

    public void printSongsByArtist(){
        for (String artist:songsByArtist.keySet()){

            System.out.println(artist +":\n");
            for (Song song:songsByArtist.get(artist)){
                System.out.println(song.toString() +"\n");
            }
        }
    }
}
