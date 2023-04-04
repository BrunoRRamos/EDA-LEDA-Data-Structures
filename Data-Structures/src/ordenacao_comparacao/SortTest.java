package ordenacao_comparacao;

public class SortTest {
    public static void main(String[] args) {
        BubbleSort bSort = new BubbleSort<>();
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = new int[3];

        arr[0] = 3;
        arr[1] = 1;
        arr[2] = 2;

        selectionSort.selectionSort(arr);

        System.out.println(selectionSort.printArr(arr));
    }
}
