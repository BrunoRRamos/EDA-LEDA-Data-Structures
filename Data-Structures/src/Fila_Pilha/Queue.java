package Fila_Pilha;

public class Queue<T> implements QueueInterface<T> {

    T[] array;
    int head;
    int tail;

    public Queue(int size) {
        this.array = (T[]) new Object[size];
        this.head = 0;
        this.tail = -1;
    }

    @Override
    public void enqueue(T elemanet) {
        if (isFull()) {
            throw new StackOverflowError("Array cheio !");
        }

        tail++;
        this.array[tail] = elemanet;
    }

    @Override
    public T dequeue() throws Exception {
        T poped;

        if (isEmpty()) {
            throw new Exception("Array vazio !");
        }

        poped = this.array[head];
        this.array[head] = null;
        head++;

        return poped;
    }

    @Override
    public T head() {
        return this.array[head];
    }

    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return tail == -1;
    }

    @Override
    public boolean isFull() {
        return tail == this.array.length - 1;
    }
}
