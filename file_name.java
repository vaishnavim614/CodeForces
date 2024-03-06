import java.util.ArrayList;
import java.util.Scanner;

public class file_name {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int cnt=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='x')
                cnt++;
            else {
                if (cnt >= 3) {
                    list.add(cnt);
                }
                cnt=0;
            }
        }

        if (cnt >= 3) {
            list.add(cnt);
        }
        int ans=0;
        for (int num:list){
            ans+=num-2;
        }
        System.out.println(ans);
    }
}
