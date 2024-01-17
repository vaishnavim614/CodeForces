import java.util.ArrayList;
import java.util.Scanner;

public class SatisfyingConstraints {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int x = sc.nextInt();

                if (a == 1) {
                    min=Math.max(min,x);
                } else if (a == 2) {
                    max=Math.min(max,x);
                } else {
                    if(x>=min && x<=max)
                        list.add(x);
                }
            }

            int cnt =0;


            for (int num:list){
                if(num>=min && num<=max)
                    cnt++;
            }
            int ans = min > max ? 0 : max - min + 1 - cnt;
            System.out.println(ans);
        }
    }
}
