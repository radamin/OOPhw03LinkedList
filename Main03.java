package OOPhw03LinkedList;

public class Main03 {
    public static void main(String[] args) {
        OurLinkedList<Integer> list = new OurLinkedList<>();
        list.add(10);
        list.add(20);
        for (int i:list) {
            System.out.println(i);
        }
    }

}