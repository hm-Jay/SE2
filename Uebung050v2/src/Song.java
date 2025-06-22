public class Song {

    private String titel;
    private String artist;


    public Song(String titel, String artist){
        validate(titel,artist);
        this.titel = titel;
        this.artist = artist;
    }

    public String getTitel(){
        return titel;
    }

    public String getArtist(){
        return artist;
    }
    
    private void validate(String titel,String artist){
        if (titel == null || titel.isEmpty() || artist == null || artist.isEmpty()){
            throw new RuntimeException("titel oder Arist dürfen nicht leer sein");
        }
    }

    @Override
    public String toString(){

        return titel + " by:" + artist;
    }

    @Override
    public boolean equals(Object object){
        if (object == this) return true;
        if (object instanceof Song){
            return ((Song) object).getArtist().equals(this.getArtist()) && ((Song) object).getTitel().equals(this.getTitel());
        }
        return false;
    }

    @Override
    public int hashCode(){
      return this.titel.hashCode() * 31 + this.artist.hashCode();
    }
}
