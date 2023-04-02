package ordenacao_comparacao;

public class SortTest {
    public static void main(String[] args) {
        int[] arr = new int[3];

        arr[0] = 3;
        arr[1] = 1;
        arr[2] = 2;

        BubbleSort.bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
