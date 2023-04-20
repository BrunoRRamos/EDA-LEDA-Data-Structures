package ordenacao_comparacao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    Random ramdom = new Random();
    int[] arr = new int[40];

    @BeforeEach
    void criaArrTest() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ramdom.nextInt(101);
        }
    }

    @Test
    void bubbleSort() {
    }
}