import java.util.Scanner;

public class FollowingDirections {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int x=0,y=0;
            boolean ans=false;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='U')
                    y+=1;
                else if(s.charAt(i)=='D')
                    y-=1;
                else if(s.charAt(i)=='R')
                    x+=1;
                else if(s.charAt(i)=='L')
                    x-=1;

                if(x==1 && y==1)
                    ans=true;
            }
            if (ans)
                System.out.println("Yes");
            else
                System.out.println("NO");
        }
    }
}
