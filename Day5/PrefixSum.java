public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5, 4};

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int l = 2;
        int r = 5;

        int sum;

        if (l == 0)
            sum = prefix[r];
        else
            sum = prefix[r] - prefix[l - 1];

        System.out.println("Subarray Sum = " + sum);
    }
}