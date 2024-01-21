import java.util.Scanner;

public class Find_The_Array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int ans=(int)Math.ceil(Math.sqrt(n));
            System.out.println(ans);
        }
    }
}
