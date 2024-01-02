import java.util.Scanner;

public class threeDoors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc .nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i]=sc.nextInt();
            }
            if(arr[n-1]==0  || arr[arr[n-1]-1]==0)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
