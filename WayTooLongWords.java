import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            int n=s.length();
            if(n>10){
                StringBuilder sb=new StringBuilder();
                sb.append(s.charAt(0));
                sb.append(n-2);
                sb.append(s.charAt(n-1));
                System.out.println(sb.toString());
            }
            else {
                System.out.println(s);
            }
        }
    }
}
