import java.util.Scanner;

public class Deaths_Blessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int[] b=new int[n];
            for (int i = 0; i < n; i++) {
                b[i]=sc.nextInt();
            }
            long sum=0,max=0;
            for (int i = 0; i < n; i++) {
                sum+=a[i];
                sum+=b[i];
                max=Math.max(max,b[i]);
            }
            System.out.println(sum-max);
        }
    }
}
