import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T> {

    private Node<T> rootNode;

    private static class Node<T> {
        public Node<T> next;
        public T value;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    // Fügt ein Element am Ende der Liste hinzu
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            Node<T> current = rootNode;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Gibt die Anzahl der Elemente in der Liste zurück
    public int size() {
        int count = 0;
        Node<T> current = rootNode;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Entfernt das erste Vorkommen eines Wertes aus der Liste
    public boolean remove(T value) {
        if (rootNode == null) return false;

        if (rootNode.value.equals(value)) {
            rootNode = rootNode.next;
            return true;
        }

        Node<T> current = rootNode;
        Node<T> previous = null;

        while (current != null && !current.value.equals(value)) {
            previous = current;
            current = current.next;
        }

        if (current == null) return false;

        previous.next = current.next;
        return true;
    }

    // Gibt den Iterator zurück (für for-each-Schleifen)
    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>(rootNode);
    }

    // Innere Iterator-Klasse
    private static class LinkedListIterator<T> implements Iterator<T> {
        private Node<T> current;

        public LinkedListIterator(Node<T> startNode) {
            this.current = startNode;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            T value = current.value;
            current = current.next;
            return value;
        }
    }
    public boolean contains(T value) {
        Node<T> current = rootNode;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

}
