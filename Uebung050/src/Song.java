public class Song {
    private String title;
    private String artist;

    public Song (String title, String artist){

        if(title == null || artist == null) {
            throw new IllegalArgumentException("Title and artist must not be null");
        }

        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    @Override
    public String toString() {
        return title + " by " + artist;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                  // Selbes Objekt → gleich
        if (obj == null || getClass() != obj.getClass()) return false; // null oder andere Klasse → ungleich

        Song other = (Song) obj;
        // Gleich, wenn Titel und Künstler gleich sind (Groß-/Kleinschreibung beachten)
        return title.equals(other.title) && artist.equals(other.artist);
    }
    @Override
    public int hashCode() {
        // Kombinierter Hash-Code von Titel und Künstler
        return title.hashCode() * 31 + artist.hashCode();
    }
}
