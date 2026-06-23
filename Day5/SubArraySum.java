import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 4, 20, 3, 10, 5};
        int target = 33;

        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                System.out.println("Subarray found from index "
                                   + start + " to " + end);
                return;
            }
        }

        System.out.println("No subarray found");
    }
}