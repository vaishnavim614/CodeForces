import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        Arrays.sort(a);
        int x=0,y=0;

        for (int i = n-1; i >=0; i--) {
            x+=a[i];
            y++;
            if(x>(sum-x)) {
                System.out.println(y);
                break;
            }
        }

    }
}
