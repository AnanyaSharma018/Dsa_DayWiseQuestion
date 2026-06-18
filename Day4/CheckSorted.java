import java.util.Scanner;
class CheckSorted{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        boolean sorted = true;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}