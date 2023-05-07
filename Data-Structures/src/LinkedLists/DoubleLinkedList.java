package LinkedLists;

import LinkedLists.interfaces.IDoubleLinkedList;

public class DoubleLinkedList<T> extends LinkedList<T> implements IDoubleLinkedList<T> {

    protected DoubleLinkedList<T> previous;

    public DoubleLinkedList(T data, LinkedList<T> next, DoubleLinkedList<T> previous) {
        super(data, next);
        this.previous = previous;
    }

    @Override
    public void insertFirst(T element) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

}
