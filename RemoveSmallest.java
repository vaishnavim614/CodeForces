import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int cnt=0;
            for (int i = 0; i < n-1; i++) {
                int diff=Math.abs(a[i] - a[i+1]);
                if(diff >1)
                    cnt++;
            }
            if(cnt==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
