import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        Long k=sc.nextLong();
        if (k<=(n+1)/2)
            System.out.println(2*k-1);
        else
            System.out.println((k - (n + 1) / 2) * 2);
    }
}
