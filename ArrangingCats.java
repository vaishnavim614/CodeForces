import java.util.Scanner;

public class ArrangingCats {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s1=sc.next();
            String s2= sc.next();
            int one = 0, zero=0;

            for (int i = 0; i < n; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    if (s1.charAt(i)=='1')
                        one++;
                    else
                        zero++;
                }
            }

            System.out.println(Math.max(one , zero));
        }
    }
}
