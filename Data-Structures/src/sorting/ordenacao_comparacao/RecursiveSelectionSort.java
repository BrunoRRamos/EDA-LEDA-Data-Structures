package sorting.ordenacao_comparacao;

import sorting.AbstractSorting;
import sorting.Util;

public class RecursiveSelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {

        if (!(leftIndex >= rightIndex)) {

            int menorValorIndex = leftIndex;

            for (int j = leftIndex + 1; j < array.length; j++) {
                if (array[j].compareTo(array[menorValorIndex]) < 0) {
                    menorValorIndex = j;
                }
            }

            Util.swap(array, leftIndex, menorValorIndex);
            sort(array, leftIndex + 1, rightIndex);
        }
    }
}
