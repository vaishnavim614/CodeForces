import java.util.Scanner;

public class Odd_Divisor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            Long n=sc.nextLong();
            if ((n & 1) == 1) {
                System.out.println("YES");
            } else {
                boolean ok = false;
                long div = n;

                while (div > 2) {
                    div /= 2;

                    if ((div & 1) == 1) {
                        if (n % div == 0) {
                            ok = true;
                            break;
                        }
                    }
                }

                if (ok) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
