import java.util.Scanner;

public class Tit_for_Tat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                while (a[i]>0 && k>0){
                    a[i]--;
                    a[n-1]++;
                    k--;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]+" ");
            }
           System.out.println();
        }
    }
}
