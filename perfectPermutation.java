import java.util.Scanner;

public class perfectPermutation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2 !=0 || n==1){
            System.out.println(-1);
        }
        else {
            int[] arr=new int[n];
            arr[0]=2;
            arr[1]=1;
            for (int i = 2; i < n; i++) {

                if(i %2==0)
                    arr[i]=i+2;
                else
                    arr[i]=i;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
