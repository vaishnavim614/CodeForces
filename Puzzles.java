import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a=new int[m];
        for (int i = 0; i < m; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int min=100000;
        for (int i = n; i <= m; i++) {
            min = Math.min(min, Math.abs(a[i - 1] - a[i - n]));
        }
        System.out.print(Math.abs(min));
    }
}
//5 7 10 10 12 22