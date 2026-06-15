import java.util.Scanner;
class PrintNto1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println(n + " To 1");
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
        
    }
}