import java.util.Arrays;

public class ChocolateDistribution {

    public static void main(String[] args) {

        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;

        int result = minDifference(arr, m);

        System.out.println("Minimum Difference = " + result);
    }

    static int minDifference(int arr[], int m) {

        if (m == 0 || arr.length == 0)
            return 0;

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - m; i++) {

            int diff = arr[i + m - 1] - arr[i];

            if (diff < minDiff)
                minDiff = diff;
        }

        return minDiff;
    }
}