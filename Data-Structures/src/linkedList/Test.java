package linkedList;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        SingleLinkedListImpl<Integer> list = new SingleLinkedListImpl<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        SingleLinkedListImpl reversed = ReverseLinkedList.reverse(list);

        System.out.println(Arrays.toString(list.toArray()));

        System.out.println(Arrays.toString(reversed.toArray()));
    }
}
