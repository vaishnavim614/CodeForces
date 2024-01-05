import java.util.Scanner;

public class Casimir {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int a=0,b=0,c=0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='A')
                    a++;
                else if (s.charAt(i)=='B') {
                    b++;
                }
                else
                    c++;
            }
            if(a+c !=b)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
