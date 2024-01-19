import java.util.Scanner;

public class PrependANDAppend {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int cnt=0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != s.charAt(n-i-1))
                    cnt+=2;
                else
                    break;
            }
            System.out.println(Math.max(n-cnt,0));
        }
    }
}
