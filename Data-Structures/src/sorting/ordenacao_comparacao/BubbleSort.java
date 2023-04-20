package sorting.ordenacao_comparacao;

public class BubbleSort<T>{

    public int[] bubbleSort(int[] intArray) {
        int aux = 0;

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                if (intArray[i] < intArray[j]) {
                    aux = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = aux;
                }
            }
        }
        return intArray;
    }

    
}
