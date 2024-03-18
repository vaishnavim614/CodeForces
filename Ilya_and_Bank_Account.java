import java.util.Scanner;

public class Ilya_and_Bank_Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t>0){
            System.out.println(t);
        }
        else {
            int a=t/10;
            int b=t/100*10+t%10;
            System.out.println(Math.max(a,b));

        }
    }
}
