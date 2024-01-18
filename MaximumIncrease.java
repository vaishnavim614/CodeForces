import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int cnt=1;
        int max=1;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            if(a[i+1]>a[i])
                cnt++;
            else
                cnt=1;
            max=Math.max(max,cnt);
        }
        System.out.println(max);
    }
}
