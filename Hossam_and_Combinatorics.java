import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hossam_and_Combinatorics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int[] a = new int[(int)n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            long mn=0,mx=0;
            if (a[0] == a[(int) n - 1]) {
                System.out.println(n * (n - 1));
            } else {
                for (int j = 0; j < n; j++) {
                    if (a[j] == a[0]) mn++;
                    if (a[(int) n - j - 1] == a[(int) n - 1]) mx++;
                }
                System.out.println(mn * mx * 2);
            }
        }

    }
}
