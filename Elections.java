import java.util.Scanner;

public class Elections {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int a1=Math.max(0,Math.max(b,c)+1-a);
            int b1=Math.max(0,Math.max(a,c)+1-b);
            int c1=Math.max(0,Math.max(b,a)+1-c);

            System.out.println(a1+ " " +b1+ " " +c1);
        }
    }
}
