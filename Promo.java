import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Promo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        Long[] a=new Long[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextLong();
        }
        Arrays.sort(a, Collections.reverseOrder());//5 5 3 2 1
        for (int i = 1; i < n; i++) {
            a[i]=a[i-1]+a[i];//5 10 13 15 16
        }
        while (q-->0){
            int x=sc.nextInt();//1    3
            int y=sc.nextInt();//1      2

            if (x==y)
                System.out.println(a[x-1]);
            else
                System.out.println(a[x-1]-a[x-y-1]);//13-5
        }
    }
}
