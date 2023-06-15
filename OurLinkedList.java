package OOPhw03LinkedList;

import java.util.Iterator;

public class OurLinkedList<T> implements Iterable<T> {
    private Element<T> head;
    private Element<T> tail;
    int listSize;

    public OurLinkedList() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public void add(T data){
        Element<T> ourElement = new Element<>(data);
        if ( listSize == 0){
            head = ourElement;
        }
        else {
            tail.next = ourElement;
            ourElement.previous = tail;
        }
        tail = ourElement;
        listSize++;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Element<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T value = current.value;
                current = current.next;
                return value;
            }
        };
    }


    public static class Element<T>{

        private final T value;
        private Element<T> next;
        public Element<T> previous;

        public Element(T value) {
            this.value = value;
            next = null;
            previous = null;
        }

    }

}