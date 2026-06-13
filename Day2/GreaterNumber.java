import java.util.Scanner;
class GreaterNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1:");
        int n1 = sc.nextInt();
        System.out.println("Enter a number 2:");
        int n2 = sc.nextInt();
        System.out.println("Enter a number 3:");
        int n3 = sc.nextInt();
        
        if(n1>n2 && n1>n3){
            System.out.println(n1+ " is greater");
        }
        else if(n2>n3 && n2>n1){
            System.out.println(n2+ " is greater");
        }
        else{
            System.out.println(n3+" is greater");
        }
        sc.close();
    }
}