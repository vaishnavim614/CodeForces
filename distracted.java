import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class distracted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            int cnt=0;
            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j) != s.charAt(j + 1)) {
                    for (int k = j+1; k < s.length(); k++) {
                        if(s.charAt(j)==s.charAt(k)){
                            cnt++;
                        }
                    }
                }
            }
            if(cnt>0)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
