package linkedList;

public class RecurssiveStackLinkedList<T> extends RecursiveSingleLinkedListImpl {

    public void push(T element) {
        if (element != null) {
            if (this.getNext().isEmpty()) {
                this.setData(element);
                this.setNext(new RecursiveSingleLinkedListImpl());

            }

        }
    }
}
