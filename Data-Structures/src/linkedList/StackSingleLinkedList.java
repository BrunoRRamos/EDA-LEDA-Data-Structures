package linkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class StackSingleLinkedList<T> extends SingleLinkedListImpl implements Stack<T>{

    protected int size;

    public StackSingleLinkedList(int size) {
        this.size = size;
    }

    @Override
    public void push(T element) {
        if (element != null) {
            if (this.head.isNIL()) {
                this.head.setData(element);
                this.head.setNext(new SingleLinkedListNode<>());

            } else {
                SingleLinkedListNode aux = this.head;

                while (!aux.isNIL()) {
                    aux = aux.getNext();
                }
                aux.setData(element);
                aux.setNext(new SingleLinkedListNode());
            }
        }
    }

    @Override
    public T pop() {
        SingleLinkedListNode aux = this.head;
        T output = null;

        if (!aux.isNIL()) {
            if (aux.getNext().isNIL()) {
                output = (T) aux.getData();
                aux.setData(null);
                aux.setNext(null);

            } else {
                while (!aux.getNext().getNext().isNIL()) {
                    aux = aux.getNext();
                }

                output = (T) aux.getNext().getData();
                aux.getNext().setData(null);
                aux.setNext(aux.getNext().getNext());
            }
        }
        return output;
    }
}
