import java.util.Scanner;

public class OddEvenIncrements {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int even1=0,odd1=0,even2=0,odd2=0;
            for (int i = 0; i < n; i +=2) {
                if(a[i]%2==0)
                    even1++;
                else
                    odd1++;
            }
            for (int i = 1; i < n; i+=2) {
                if(a[i]%2==0)
                    even2++;
                else
                    odd2++;
            }
            if(even1==0 || odd1==0){
                if(even2==0 || odd2==0)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            else
                System.out.println("No");
        }
    }
}
