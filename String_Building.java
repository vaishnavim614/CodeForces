import java.util.Scanner;

public class String_Building {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            if (s.matches("((aa)|(aaa)|(bb)|(bbb))+"))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
