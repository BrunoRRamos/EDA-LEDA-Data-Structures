package Fila_Pilha;

public interface StackInterface<T> {
    public void push(T elemanet) throws  StackOverflowError;
    public T pop() throws Exception;
    public T top();
    public boolean isEmpty();
    public boolean isFull();
}
