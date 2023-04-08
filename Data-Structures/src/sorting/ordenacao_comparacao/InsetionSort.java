package sorting.ordenacao_comparacao;

import sorting.AbstractSorting;
import sorting.Util;

public class InsetionSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        for (int i = leftIndex + 1; i < rightIndex + 1; i++) {
            int index = i;

            while (index > 0 && array[index].compareTo(array[index - 1]) < 0) {
                Util.swap(array, index, index - 1);
                index--;
            }
        }
    }
}
