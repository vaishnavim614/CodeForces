import java.util.Scanner;

public class Theatre_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();
        long l=(n+a-1)/a;
        long b=(m+a-1)/a;
        System.out.println(l*b);
    }
}
