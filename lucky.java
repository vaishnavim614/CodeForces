import java.util.Scanner;

public class lucky {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s=sc.next();
            int first=s.charAt(0)+s.charAt(1)+s.charAt(2);
            int second=s.charAt(3)+s.charAt(4)+s.charAt(5);
            if(first==second){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
