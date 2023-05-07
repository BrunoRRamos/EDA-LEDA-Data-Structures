package LinkedLists;

public interface IDoubleLinkedList<T> extends ILinkedList<T> {

    public void insertFirst(T element);
    public void removeFirst();
    public void removeLast();
}
