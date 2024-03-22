import java.util.Arrays;
import java.util.Scanner;

public class Median_of_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);

            int mid = (n + 1) / 2-1;
            int val= a[mid];

            int cnt=1;
            for (int i = mid + 1; i < n; i++) {
                if (val == a[i]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
