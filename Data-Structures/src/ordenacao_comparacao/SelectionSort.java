package ordenacao_comparacao;

public class SelectionSort<T> implements CommonMet<T>{
    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int menorValorIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[menorValorIndex]) {
                    menorValorIndex = j;
                }
            }

            int aux = arr[i];
            arr[i] = arr[menorValorIndex];
            arr[menorValorIndex] = aux;
        }
        return arr;
    }

    @Override
    public String printArr(int[] arr) {
        String ordem = "";
        for (int i = 0; i < arr.length; i++) {
            ordem += String.format("%d ", arr[i]);
        }
        return ordem;
    }
}
