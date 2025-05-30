public class TestResManager {
    public static void main(String[] args) {
        ResourceManagement rm = new ResourceManagement();

        StaffMember staffMember = new StaffMember("S1", "Frank Walter", "Prof");
        Book book = new Book("B1", "Amogus", "Amogusmaster");
        String[] software1 = {"RPA", "Office"};
        Computer computer = new Computer("C1", "Mac", "Windows", software1);

        StaffMember staffMember2 = new StaffMember("S2", "Anna Schmidt", "Lecturer");
        Book book2 = new Book("B2", "Java Basics", "John Doe");
        String[] software2 = {"Linux", "Docker", "VSCode"};
        Computer computer2 = new Computer("C2", "Arbeits-PC", "Linux", software2);

        // Ressourcen hinzufügen
        rm.addHMResource(staffMember);
        rm.addHMResource(book);
        rm.addHMResource(computer);

        rm.addHMResource(staffMember2);
        rm.addHMResource(book2);
        rm.addHMResource(computer2);

        // Alle Ressourcen ausgeben
        System.out.println("=== Alle Ressourcen ===");
        rm.printHMResources();

        // Ressourcen nach Typ ausgeben
        System.out.println("\n=== Ressourcen nach Typ ===");
        rm.displayResourceByType();

        // Suche testen
        System.out.println("\n=== Suche nach 'Java' ===");
        rm.searchInResource("Java");
        System.out.println("\n=== Suche nach 'Linux' ===");
        rm.searchInResource("Linux");

        // Entfernen testen
        System.out.println("\n=== Entferne StaffMember S1 ===");
        rm.removeHMResource(staffMember);

        // Ausgabe nach Entfernen
        System.out.println("\n=== Ressourcen nach Entfernen ===");
        rm.printHMResources();
        rm.schreibeÜbersichtInDatei("TestDatei");
    }
}
