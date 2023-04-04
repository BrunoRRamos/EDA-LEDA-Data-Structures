package ordenacao_comparacao;

public class InsertionSort<T> implements CommonMet<T>{
    public int[] insertionSort(int[] arr) {
        int index = arr.length - 1;

        while (index > 0 && arr[index] < arr[index - 1]) {
            int aux = arr[index];
            arr[index] = arr[index - 1];
            arr[index - 1] = aux;
            index -= 1;
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
