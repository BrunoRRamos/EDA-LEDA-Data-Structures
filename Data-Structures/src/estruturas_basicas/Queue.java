package estruturas_basicas;

public interface Queue<T> {
    public void enqueue(T elemanet) throws  StackOverflowError;
    public T dequeue() throws Exception;
    public T head();
    public int size();
    public boolean isEmpty();
    public boolean isFull();
}
