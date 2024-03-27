import java.util.Scanner;

public class String_Task {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();

        int n=s.length();

        for (int i = 0; i < n; i++) {
            char c=s.charAt(i);
            if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && c!='y'){
                System.out.print("."+c);
            }
        }

    }
}
