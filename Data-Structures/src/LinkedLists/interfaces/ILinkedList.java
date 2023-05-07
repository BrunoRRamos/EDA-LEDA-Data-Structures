package LinkedLists.interfaces;

public interface ILinkedList<T> {

    public void insert(T element);
    public void remove(T element);
    public T search(T element);
    public int size();
    public boolean isEmpty();
    public T[] toArray();
}
