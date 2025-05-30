public abstract class HMResource {
    private final String id;
    private final String titel;

    public HMResource(String id, String titel) {
        if (id == null || titel == null) {
            throw new IllegalArgumentException("ID und Titel dürfen nicht null sein.");
        }

        this.id = id;
        this.titel = titel;
    }

    public String getId() {
        return id;
    }
    public String getTitel() {
        return titel;
    }

    @Override
    public String toString() {
        return id + ": " + titel;
    }

    public abstract boolean matchesSearch(String searchFor);
}
