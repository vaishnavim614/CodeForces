import java.util.Scanner;

public class Arithmetic_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int sum=0;
            for (int i = 0; i < n; i++) {
                sum+=sc.nextInt();
            }
            if (sum>=n)
                System.out.println(sum-n);
            else
                System.out.println(1);
        }
    }
}
