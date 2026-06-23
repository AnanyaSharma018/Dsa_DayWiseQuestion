public class EvenOddSubarray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 6, 3, 8};

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
                (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                currLen++;
                maxLen = Math.max(maxLen, currLen);
            } else {
                currLen = 1;
            }
        }

        System.out.println("Maximum Length = " + maxLen);
    }
}