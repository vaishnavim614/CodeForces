import java.util.Scanner;

public class Space_Navigation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            String s=sc.next();
            int u=0,d=0,l=0,r=0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='U')
                    u++;
                else if (s.charAt(i)=='R') {
                    r++;
                } else if (s.charAt(i)=='D') {
                    d--;
                }
                else
                    l--;
            }
            if(r>=x && l<=x && u>=y && d<=y)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
