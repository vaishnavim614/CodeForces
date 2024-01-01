import java.util.Scanner;

public class story {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s="codeforces";
        for(int i=0;i<t;i++){
            String s2=sc.next();
            int count=0;
            for(int j=0;j<10;j++){
                if(s.charAt(j) != s2.charAt(j))
                    count++;
            }
            System.out.println(count);
        }
    }
}
