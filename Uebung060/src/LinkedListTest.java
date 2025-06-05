public class LinkedListTest {

        public static void main(String[] args) {
            LinkedList<Integer> ll = new LinkedList<Integer>();
            System.out.println("Current Size: " + ll.size());
            ll.add(10);
            ll.add(20);
            ll.add(30);
            System.out.println("Current Size: " + ll.size());
            System.out.println("Contains 20: " + ll.contains(20));
            System.out.println("Contains 50: " + ll.contains(50));
            for(var item : ll){
                System.out.println(item);
            }
            System.out.println("---");
            ll.remove(10);
            ll.remove(30);
            for(var item : ll){
                System.out.println(item);
            }
        }

}
