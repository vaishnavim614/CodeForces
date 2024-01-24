import java.util.Scanner;

public class Long_Long {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            long sum=0;
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
                sum+=Math.abs(a[i]);
            }
            int cnt=0;
            for (int i = 0; i < n; i++) {
                if (a[i]<0){
                    cnt++;
                    while (i<n && a[i]<=0){
                        i++;
                    }
                    i--;
                }

            }
            System.out.println(sum+" "+cnt);

        }
    }
}
