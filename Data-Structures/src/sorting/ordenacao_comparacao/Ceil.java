package sorting.ordenacao_comparacao;

public class Ceil {

    private int auxCeil(int[] array, int taget, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = (start + end) / 2;

        if (array[middle] == taget) {
            return array[middle];

        } else if (taget > array[middle]) {
            return auxCeil(array, taget, middle + 1, end);

        } else {
            int ceilItem = auxCeil(array, taget, start, middle - 1);
            return ceilItem != -1 ? ceilItem : array[middle];
        }
    }


    public int ceil(int[] array, int taget, int start, int end) {
        return auxCeil(array, taget, start, end);
    }
}


