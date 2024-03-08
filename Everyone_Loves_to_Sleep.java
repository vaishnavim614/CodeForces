import java.util.Scanner;

public class Everyone_Loves_to_Sleep {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int H=sc.nextInt();
            int M=sc.nextInt();
            int sleep=Integer.MAX_VALUE;
            while (n-->0){
                int hi=sc.nextInt();
                int mi=sc.nextInt();

                int alarm=hi*60+mi;
                int bed=H*60+M;
                int diff=alarm-bed;

                if (diff<0){
                    diff+=24*60;
                }
                sleep=Math.min(sleep,diff);
            }
            int hrs=sleep/60;
            int mins=sleep%60;
            System.out.println(hrs+" "+mins);
        }

    }
}
