import java.util.Scanner;

public class DubStep {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int t=1;
        for (int i = 0; i < n; i++) {
            if(i + 2 < n && s.charAt(i)=='W' && s.charAt(i+1)=='U' && s.charAt(i+2)=='B'){
                i=i+2;
                if (t!=1){
                    System.out.print(" ");
                }
            }
            else {
                System.out.print(s.charAt(i));
                t = 0;
            }
        }
    }
}
