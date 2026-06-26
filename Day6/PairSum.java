import java.util.HashSet;

public class PairSum {

    public static void findPairs(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int target = sum - num;

            if (set.contains(target))
                System.out.println("(" + target + ", " + num + ")");

            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,7,-1,5};
        int sum = 6;

        findPairs(arr, sum);
    }
}