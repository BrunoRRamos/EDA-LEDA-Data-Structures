package LinkedLists;

import LinkedLists.interfaces.ILinkedList;

public class LinkedList<T> implements ILinkedList<T> {

    protected T data;
    protected LinkedList<T> next;

    public LinkedList(T data, LinkedList<T> next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public void insert(T element) {

    }

    @Override
    public void remove(T element) {

    }

    @Override
    public T search(T element) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T[] toArray() {
        return (T[]) new Object[0];
    }
}
