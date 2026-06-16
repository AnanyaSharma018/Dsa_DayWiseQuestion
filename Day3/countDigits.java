import java.util.Scanner;

class CountDigits {
    static int count(int n) {
        if (n == 0)
            return 0;
        return 1 + count(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Digits = " + count(Math.abs(n)));
    }
}