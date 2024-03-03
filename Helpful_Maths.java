import java.util.Scanner;

public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int n=s.length();

        int o=0,t=0,th=0;
        for (int i = 0; i < n; i++) {
            char ch=s.charAt(i);
            if(ch=='1')
                o++;
            else if (ch=='2') {
                t++;
            }
            else if (ch=='3')
                th++;
        }

        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < o; i++) {
            sb.append("1+");
        }
        for (int i = 0; i < t; i++) {
            sb.append("2+");
        }
        for (int i = 0; i < th; i++) {
            sb.append("3+");
        }
        System.out.println(sb.substring(0,sb.length()-1));
    }
}
