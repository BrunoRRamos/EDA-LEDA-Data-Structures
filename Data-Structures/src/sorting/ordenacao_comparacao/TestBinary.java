package sorting.ordenacao_comparacao;

import java.util.Arrays;

public class TestBinary {
    public static void main(String[] args) {
        BinarySearch bin = new BinarySearch();
        Ceil close = new Ceil();
        Floor floor = new Floor();
        CloseSet closeSet = new CloseSet();
        RaizQuadrada raiz = new RaizQuadrada();

        int[] arr = new int[]{1, 2, 3, 5, 6, 7};
        System.out.println(bin.search(arr, 4, 0, 6));
        System.out.println(close.ceil(arr, 4, 0, 6));
        System.out.println(floor.floor(arr, 4, 0, 6));
        System.out.println(Arrays.toString(closeSet.closeSet(arr, 4, 0, 6)));
        System.out.println(raiz.calculaRaix(144, 0.0001));
    }
}
