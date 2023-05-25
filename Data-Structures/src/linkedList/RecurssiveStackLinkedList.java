package linkedList;


public class RecurssiveStackLinkedList<T> implements Stack<T> {

    protected T data;
    protected RecurssiveStackLinkedList<T> next;

    public RecurssiveStackLinkedList() {}

    @Override
    public void push(T element) {
        if (element != null) {
            if (this.getData() == null) {
                this.setData(element);
                this.setNext(new RecurssiveStackLinkedList());
            } else {
                this.getNext().push(element);
            }
        }
    }

    @Override
    public T pop() {
        if (this.getNext().getData() == null) {
            T output = this.getData();
            this.setData(null);
            this.setNext(null);
            return output;
        } else {
            return this.getNext().pop();
        }
    }

    public T getData() {
        return this.data;
    }


    public void setData(T data) {
        this.data = data;
    }

    public RecurssiveStackLinkedList<T> getNext() {
        return this.next;
    }

    public void setNext(RecurssiveStackLinkedList<T> next) {
        this.next = next;
    }

    public T[] toArray() {
        T[] array = (T[]) new Object[size()];
        toArrayAux(array, 0);
        return array;
    }

    private void toArrayAux(T[] arr, int index) {
        if (this.getData() != null) {
            arr[index] = getData();
            this.next.toArrayAux(arr, index + 1);
        }
    }

    public int size() {
        int size = 0;

        if (this.getData() != null) {
            size = next.size();
            size++;
        }
        return size;
    }
}
