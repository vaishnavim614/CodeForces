import java.util.Scanner;

public class Lucky_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        if (n%4==0 || n%7==0 || n%47==0 || n%74==0 || n%477==0 || n%744==0){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
