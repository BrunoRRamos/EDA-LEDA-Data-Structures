package sorting.ordenacao_comparacao;

import sorting.AbstractSorting;
import sorting.Util;

public class RecursiveBubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {

        if (!(leftIndex >= rightIndex)) {

            for (int i = leftIndex; i < rightIndex; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    Util.swap(array, i, i + 1);
                }
            }
            sort(array, leftIndex, rightIndex - 1);
        }
    }
}
