public class Book extends HMResource {
    private final String author;

    public Book(String id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return super.toString() + "\nAuthor: " + author;
    }
    @Override
    public boolean matchesSearch(String searchFor) {
        searchFor = searchFor.toLowerCase();
        return getId().toLowerCase().contains(searchFor) ||
                getTitel().toLowerCase().contains(searchFor) ||
                author.toLowerCase().contains(searchFor);
    }

}
