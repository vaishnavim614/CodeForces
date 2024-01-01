import java.util.Scanner;

public class moves {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int ans=0;
            if(n !=1){
                ans=(n/3)+Math.min(1, n % 3);
            }
            else
                ans=(n/3)+2;

            System.out.println(ans);
        }
    }
}
