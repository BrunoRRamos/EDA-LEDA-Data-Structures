package ordenacao_comparacao;

public class SortTest {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort<>();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = new int[3];

        arr[0] = 3;
        arr[1] = 1;
        arr[2] = 2;

        insertionSort.insertionSort(arr);

        System.out.println(insertionSort.printArr(arr));
    }
}
