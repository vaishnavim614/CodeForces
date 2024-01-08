import java.util.Scanner;

public class MaximumInTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] tab=new int[n][n];
        for (int i = 0; i < n; i++) {
            tab[i][0]=tab[0][i]=1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                tab[i][j]=tab[i-1][j]+tab[i][j-1];
            }
        }
        System.out.println(tab[n-1][n-1]);
    }
}
