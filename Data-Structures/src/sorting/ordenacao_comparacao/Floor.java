package sorting.ordenacao_comparacao;

public class Floor {
    private int auxFloor(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int middle = (start + end) / 2;

        if (array[middle] == target) {
            return array[middle];

        } else if (target < array[middle]) {
            return auxFloor(array, target, start, middle - 1);

        } else {
            int floorItem = auxFloor(array, target, middle + 1, end);
            return floorItem != -1 ? floorItem : array[middle];
        }
    }

    public int floor(int[] array, int taget, int start, int end) {
        return auxFloor(array, taget, start, end - 1);
    }
}
