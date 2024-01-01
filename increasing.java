import java.util.Arrays;
import java.util.Scanner;

public class increasing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int j=0;j<n;j++) {
                a[j] = sc.nextInt();
            }
            Arrays.sort(a);
            int count=0;
            for(int j=1;j<a.length;j++) {
                    if (a[j] == a[j-1])
                        count++;
            }
            if(count>0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
