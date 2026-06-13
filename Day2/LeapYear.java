import java.util.Scanner;
class LeapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int year = sc.nextInt();
        
        
        if(year%4==0 && year!=100 || year%400==0){
            System.out.println(year+ " is Leap year");
        }
        
        else{
            System.out.println(year+" is not Leap year");
        }
        sc.close();
    }
}