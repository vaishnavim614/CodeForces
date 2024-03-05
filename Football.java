import java.util.Scanner;

public class Football {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int cnt=1;
        for (int i = 1; i <n; ++i) {

            if (s.charAt(i)==s.charAt(i-1)){
                cnt++;
                if (cnt==7){
                    System.out.println("YES");
                    return;
                }
            }
            else
                cnt=1;
        }


        System.out.println("NO");
    }
}
