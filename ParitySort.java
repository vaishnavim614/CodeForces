import java.util.Arrays;
import java.util.Scanner;

public class ParitySort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] arr=new int[n];
            boolean ans=true;
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
                arr[i]=a[i];
            }
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                if(a[i]%2 != arr[i]%2) {
                    ans = false;
                    break;
                }
            }
            if (ans)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
