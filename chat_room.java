import java.util.Scanner;

public class chat_room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();
        int j=0;
        String s1="hello";
        for (int i=0;i<n;i++) {
            if (s.charAt(i)==s1.charAt(j))
                j++;

            if (j == s1.length()){
                System.out.println("YES");
                return;
            }

        }

            System.out.println("NO");
    }


}
