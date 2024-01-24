import java.util.Scanner;

public class fence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long t=sc.nextInt();
        while (t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();

            System.out.println(a+b+c-1);
        }
    }
}
