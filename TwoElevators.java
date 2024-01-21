import java.util.Scanner;

public class TwoElevators {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int first=a-1,sec=Math.abs(b-c)+c-1;
            if (a==1 || first<sec){
                System.out.println('1');
            }
            else if (sec<first)
                System.out.println('2');
            else if (first==sec) {
                System.out.println('3');
            }
        }
    }
}
