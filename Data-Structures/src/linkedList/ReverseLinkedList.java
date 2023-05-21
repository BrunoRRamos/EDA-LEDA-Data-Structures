package linkedList;

import linkedList.SingleLinkedListImpl;
import linkedList.SingleLinkedListNode;

public class ReverseLinkedList {

    public static SingleLinkedListImpl reverse(SingleLinkedListImpl list) {
        SingleLinkedListImpl reversed = new SingleLinkedListImpl();
        SingleLinkedListNode aux = list.head;

        while (aux.getData() != null) {
            reversed.insertFirst(aux.getData());
            aux = aux.next;
        }

        return reversed;
    }


}
