public class Book extends HMResource{

    private String author;

    public Book(String id, String titel, String author){
        super(id, titel);
        this.author = author;
    }

    @Override
    public boolean searchInthisResource(String searchFor){
        if (super.searchInthisResource(searchFor) || author.equals(searchFor)){
            return true;
        }
        else return false;
    }
}
