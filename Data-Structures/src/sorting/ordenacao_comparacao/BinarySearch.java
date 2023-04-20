package sorting.ordenacao_comparacao;

public class BinarySearch {
    public int search(int[] array, int taget, int start, int end) {
        int middle = (start + end) / 2;

        if (start > end) {
            return 0;
        }

        if (array[middle] == taget) {
            return array[middle];
        }

        if (taget < array[middle]) {
            return search(array, taget, start, middle - 1);

        } else {
            return search(array, taget, middle + 1, end);
        }
    }
}
