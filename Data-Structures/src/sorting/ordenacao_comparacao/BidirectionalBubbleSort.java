package sorting.ordenacao_comparacao;

import sorting.AbstractSorting;
import sorting.Util;

public class BidirectionalBubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {

        if (!(leftIndex >= rightIndex))  {
            for (int i = leftIndex; i < rightIndex; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    Util.swap(array, i, i + 1);
                }
            }

            for (int i = rightIndex; i > leftIndex; i--) {
                if (array[i].compareTo(array[i - 1]) < 0) {
                    Util.swap(array, i, i - 1);
                }
            }

            sort(array, leftIndex + 1, rightIndex - 1);
        }
    }
}
