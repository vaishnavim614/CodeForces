import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum=0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if(a[i] %2 !=0)
                    sum++;
            }
            if(sum %2 ==0 )
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
