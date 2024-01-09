import java.util.Scanner;

public class Drinks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int or=n;
        float sum=0;
        while (n-->0){
            sum +=sc.nextInt();
        }
        System.out.println(sum/or);
    }
}
