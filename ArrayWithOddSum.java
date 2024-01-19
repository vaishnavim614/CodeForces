import java.util.Scanner;

public class ArrayWithOddSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int sum=0;
            int even=0,odd=0;
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
                sum+=a[i];
                if (a[i]%2==0)
                    even++;
                else
                    odd++;
            }
            if(sum%2!=0)
                System.out.println("Yes");
            else if (odd>0 && even>0)
                System.out.println("YES");
            else
                System.out.println("No");
        }
    }
}
