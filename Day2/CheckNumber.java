import java.util.Scanner;
class CheckNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("ZERO");
        }
        else if(n<0){
            System.out.println("NEGATIVE");
        }
        else{
            System.out.println("POSITIVE");
        }
        sc.close();
    }
}