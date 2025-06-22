import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value){
            this.value = value;
        }
    }

    Node<T> rootNode = null;

    public void add(T value){
        if(rootNode == null){
            rootNode = new Node<>(value);
        }
        else {
                Node<T> newnode = new Node<>(element);
                Node<T> current = rootNode;
                while(current.next != null) {
                    current = current.next;
                }

                current.next = newnode;
        }
    }

    public int size(){
        return 0;
    }

    public void remove(T value){
        System.out.println("Der Node wurde gelöscht");
    }


    public Iterator<T> iterator(){
        return new LinkedListIterator(rootNode);
    }

    private static class LinkedListIterator<T> implements Iterator<T> {
       private Node<T> current;

       public LinkedListIterator(Node<T> startNode){
           this.current = startNode;
       }

       @Override
       public boolean hasNext(){
           return current.next != null;
       }

       @Override
       public T next(){
           current = current.next;
           return current.value;
       }

    }

}
