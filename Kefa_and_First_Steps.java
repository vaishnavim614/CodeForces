import java.util.Scanner;

public class Kefa_and_First_Steps {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int cnt=1;
        int max=1;
        for (int i = 0; i < n-1; i++) {
            if (a[i+1]>=a[i]) {
                cnt++;
                max=Math.max(max,cnt);
            }
            else
                cnt=1;
        }
        System.out.print(max);
    }
}
