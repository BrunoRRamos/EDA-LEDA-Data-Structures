package linkedList;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        StackSingleLinkedList<Integer> stack = new StackSingleLinkedList<>(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(Arrays.toString(stack.toArray()));

        System.out.println(stack.pop());
        System.out.println(Arrays.toString(stack.toArray()));
        System.out.println(stack.pop());
        System.out.println(Arrays.toString(stack.toArray()));
        System.out.println(stack.pop());
        System.out.println(Arrays.toString(stack.toArray()));
        System.out.println(stack.pop());
        System.out.println(Arrays.toString(stack.toArray()));
    }
}
