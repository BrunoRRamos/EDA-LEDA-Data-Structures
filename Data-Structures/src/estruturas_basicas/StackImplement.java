package estruturas_basicas;

public class StackImplement<T> implements StackInterface<T> {
    private T[] array;
    private int top;

    public StackImplement(int size) {
        this.array = (T[]) new Object[size];
        this.top = -1;
    }

    @Override
    public void push(T element) {
        if (isFull()) {
            throw new StackOverflowError("Array cheio !");
        }

        top++;
        this.array[top] = element;
    }

    @Override
    public T pop() throws Exception {
        T poped;

        if (isEmpty()) {
            throw new Exception("Array vazio !");
        }

        poped = this.array[top];
        this.array[top] = null;
        top--;

        return poped;
    }

    @Override
    public T top() {
        return this.array[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == this.array.length - 1;
    }
}
