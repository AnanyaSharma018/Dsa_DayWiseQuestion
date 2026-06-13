import java.util.Scanner;
public class InvertedRightAngleTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of lines:");
        int n = sc.nextInt();
        for(int i = 0;i<=n;i++){
            for(int j = i+1;j<=n;j++){
                System.out.print("*");

            }
                System.out.println(" ");
        }          
    }
}