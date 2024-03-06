import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        if (s.contains(String.valueOf('H'))||s.contains(String.valueOf('Q')) || s.contains(String.valueOf('9')) )
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
