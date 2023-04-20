package sorting.ordenacao_comparacao;

public class CloseSet {
    public int[] closeSet(int[] array, int taget, int start, int end) {
        Ceil ceil = new Ceil();
        Floor floor = new Floor();
        int ceilValue = ceil.ceil(array, taget, start, end);
        int floorvalue = floor.floor(array, taget, start, end);

        int[] output = new int[]{floorvalue, ceilValue};
        return output;
    }
}
