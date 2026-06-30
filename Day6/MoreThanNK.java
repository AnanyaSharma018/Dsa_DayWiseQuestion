import java.util.HashMap;

public class MoreThanNK {
    public static void main(String[] args) {

        int arr[] = {3, 1, 2, 2, 1, 2, 3, 3};
        int k = 4;

        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Elements appearing more than n/k times:");

        for (int key : map.keySet()) {
            if (map.get(key) > n / k) {
                System.out.println(key);
            }
        }
    }
}