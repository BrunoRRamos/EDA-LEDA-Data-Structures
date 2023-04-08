package sorting.ordenacao_comparacao;

import sorting.AbstractSorting;
import sorting.Util;

public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

    @Override
    public void sort(T[] array, int leftIndex, int rightIndex) {
        for (int i = leftIndex; i < rightIndex; i++) {

            int menorValorIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[menorValorIndex]) < 0) {
                    menorValorIndex = j;
                }
            }
            Util.swap(array, i, menorValorIndex);
        }
    }

}
