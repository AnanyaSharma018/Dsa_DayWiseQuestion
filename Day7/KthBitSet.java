public class KthBitSet {
    public static void main(String[] args) {

        int num = 10;   //1010
        int k = 2;

        if ((num & (1 << (k - 1))) != 0)
            System.out.println("Kth bit is Set");
        else
            System.out.println("Kth bit is Not Set");
    }
}