import java.util.Scanner;

public class Burenka_Plays_with_Fractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();
            long d = sc.nextInt();
            long n1 = a * d;
            long n2 = b * c;
            int cnt = 0;
            if (n1 == n2) {
                cnt = 0;
            }
            else if (n1 == 0 || n2 == 0)
                cnt = 1;
             else if (n1 % n2 == 0 || n2 % n1 == 0) {
                cnt = 1;
            } else
                cnt = 2;

            System.out.println(cnt);
        }
    }
}
