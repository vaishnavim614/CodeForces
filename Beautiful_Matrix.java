import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int[][] a=new int[5][5];
        int f=0,s=0;
        for(int i=0;i<5;i++){
            for (int j = 0; j < 5; j++) {
                a[i][j]=sc.nextInt();
                if (a[i][j]==1){
                    f=i;
                    s=j;
                }
            }
        }

        System.out.println(Math.abs(f-2)+Math.abs(s-2));
    }

}
