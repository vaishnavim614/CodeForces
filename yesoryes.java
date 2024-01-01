import java.util.Scanner;

public class yesoryes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            String s="YES";
            String s2=sc.next();
            if(s.equals(s2.toUpperCase()))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
