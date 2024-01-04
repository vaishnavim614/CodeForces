import java.util.Scanner;

public class Pedestal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int a=n%3;
            int h=n/3;

            if(a==2){
                System.out.println((h+1) + " " + (h+2) + " " + (h-1));
            } else if (a==1) {
                System.out.println((h) + " " + (h+2) + " " + (h-1));
            }
            else {
                System.out.println((h) + " " + (h+1) + " " + (h-1));
            }
        }
    }
}
