import java.util.Scanner;

public class Bit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int cnt=0;
        while (t-->0){
            String s=sc.next();
            if(s.contains("++"))
                cnt++;
            else if (s.contains("--")) {
                cnt--;
            }
        }
        System.out.println(cnt);
    }
}
