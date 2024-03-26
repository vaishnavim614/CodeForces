import java.util.Scanner;

public class Young_Physicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cntx=0,cnty=0,cntz=0;
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            cntx+=x;
            cnty+=y;
            cntz+=z;
        }
        if (cntx==0 && cnty==0 && cntz==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
