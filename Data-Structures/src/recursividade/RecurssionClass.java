package recursividade;

import static java.lang.System.exit;

public class RecurssionClass {
    private int count;
    private int[] arr;

    public RecurssionClass() {
        this.count = 0;
        this.arr = new int[10];
    }

    public int countTo(int ceilValue) {
        if (this.count < ceilValue) {
            System.out.println(count);
            count ++;
            countTo(ceilValue);
        }
        return count;
    }

    public void populateArray() {
        if (this.count < getArrlegth()) {
           arr[count] = count;
           count ++;
           populateArray();
        }
        resetCount();
    }

    public void returnCouples() {
        if (count < arr.length && count != 0) {
            if (arr[count] % 2 == 0) {
                System.out.println(arr[count]);
                count++;
                returnCouples();
            }
        } else {
            count++;
            returnCouples();
        }

        resetCount();
        exit(0);
    }

    public int getArrlegth() {
        return this.arr.length;
    }

    public void resetCount() {
        this.count = 0;
    }
}
