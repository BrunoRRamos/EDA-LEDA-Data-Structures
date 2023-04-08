package sorting;

public class Util {

    public static void swap(Object[] array, int i, int j) {
        if (array == null)
            throw new IllegalArgumentException();

        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static boolean isPrime(long n) {
        boolean result = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                result = false;
                break;
            }
        }
        return result;
    }
}
