import java.util.Arrays;
import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        long first=a+b+c;//2
        long sec=a*b*c;//1
        long third=a*(b+c);//
        long fourth=(a+b)*c;

        long ans=Math.max(first,sec);
        System.out.println(Math.max(ans,Math.max(third,fourth)));
    }
}
