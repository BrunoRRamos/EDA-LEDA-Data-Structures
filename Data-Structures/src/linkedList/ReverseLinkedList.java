package linkedList;

import java.util.ArrayList;

public class ReverseLinkedList {

    public  void reverse(SingleLinkedListImpl list) {
        SingleLinkedListNode aux = list.getHead();
        SingleLinkedListNode temp = new SingleLinkedListNode<>();
        SingleLinkedListNode otherAux = list.getHead().getNext();
        SingleLinkedListNode tail = new SingleLinkedListNode<>();

        for (int i = 0; i < list.size() / 2; i++) {
            while (!otherAux.getNext().equals(tail)) {
                otherAux = otherAux.getNext();
            }
            temp.setData(aux.getData());
            aux.setData(otherAux.getData());
            otherAux.setData(temp.getData());
            aux = aux.getNext();
            tail = otherAux;
            otherAux = aux.getNext();
        }
    }

}
