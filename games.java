import java.util.Scanner;

public class games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            a[i] = sc.nextInt();
        }
        int count=0;
        for (int j = 0; j < a.length; j+=2) {
           for(int k=0;k<a.length;k++)
               if(a[j]==a[k] && k%2==1)
                   count++;
        }
        System.out.print(count);

    }
}
