import java.util.HashMap;
import java.util.Scanner;

public class JugglingLetters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            HashMap<Character,Integer> map=new HashMap<>();
            String arr[]=new String[n];
            boolean ok = true;

            for(int i=0; i<n; i++) {
                arr[i] = sc.next();
            }
            for(String str : arr) {
                for(char ch : str.toCharArray()) {
                    map.put(ch,map.getOrDefault(ch, 0)+1);
                }
            }
            for(int ele : map.values()) {
                if(ele%n!=0) {
                    ok = false;
                }
            }
            if(ok) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
