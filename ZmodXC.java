import java.util.Scanner;

public class ZmodXC {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a= sc.nextInt();
            int b= sc.nextInt();;
            int c=sc.nextInt();

            int x=a+1,y=b+1,z=c+1;
            int[] ans=new int[3];

            while (true){
                if(x%y==a && y % z == b && z % x == c){
                    ans[0] = x;
                    ans[1] = y;
                    ans[2] = z;
                    break;
                }

                x++;
                y++;
                z++;
            }

            System.out.print(ans[0] + " " + ans[1] + " " + ans[2]);

        }
    }
}
