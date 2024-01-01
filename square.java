import java.util.Scanner;

public class square {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            long sum=0;
            for (int j=0;j<n;j++){
                arr[j]=sc.nextInt();
                sum +=arr[j];
            }
            if (Math.sqrt(sum)==(int)(Math.sqrt(sum))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
