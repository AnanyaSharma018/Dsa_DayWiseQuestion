import java.util.Scanner;
class Print1toN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("1 To "+ n);
        for(int i =1;i<=n;i++){
            System.out.println(i);
        }
        
    }
}