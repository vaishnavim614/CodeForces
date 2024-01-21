import java.util.Scanner;

public class Imboredwithlife {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int fact=1;
//        int a_fact=factorial(a);
//        int b_fact=factorial(b);
//        int gcd=gcd(a_fact,b_fact);

        for (int i = 1; i <= Math.min(a,b); i++) {
            fact *=i;
        }
        System.out.println(fact);
    }
//    public static int factorial(int n){
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
//    }
//    public static int gcd(int x,int y){
//        while (y!=0){
//            int temp=y;
//            y=x%y;
//            x=temp;
//        }
//        return x;
//    }
}
