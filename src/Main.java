import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //reverse the order of elements inside the array between indexes k and j
        //expected output : {1, 2, 6, 5, 4, 3, 7
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        int k = 2;
        int j = 5;

        int swapsCount = (j + 1 - k) / 2;
        for (int i = 0; i < swapsCount; i++) {
            var frontIndex = k + i;
            var backIndex = j - i;
            var swapValue = arr[frontIndex];
            arr[frontIndex] = arr[backIndex];
            arr[backIndex] = swapValue;
        }

        System.out.println(String.join(",", Arrays.toString(arr)));
    }
}
