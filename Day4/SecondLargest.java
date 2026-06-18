import java.util.Scanner;
class SecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the SIze:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int largest = a[0];
        int secondlargest= a[0];
        for(int i = 0;i<n;i++){
            if(a[i]>largest){
                secondlargest = largest;
                largest = a[i];
            }
            else if(secondlargest<a[i] && a[i]!=largest){
                secondlargest = a[i];
            }
            
            
        }
        System.out.println("Second Largest Element:"+ secondlargest);
        
    }
}