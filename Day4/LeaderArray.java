import java.util.Scanner;
    class LeaderArray{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size:");
            int n = sc. nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            
            for(int i = 0;i<n;i++){
                  boolean leader = true;
                  for(int j = i+1;j<n;j++){
                      if(arr[j]>arr[i]){
                          leader = false;
                          break;
                      }
                  }
            
            
        if(leader)
        System.out.print(arr[i]+ " ");
            }
    }
}