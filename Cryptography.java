import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Cryptography {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            HashMap<Integer,Integer> map=new HashMap<>();
            int p=sc.nextInt();
            int a=0;
            for (int i = 2; i < p; i++) {
                int b=p%i;
                if(map.containsValue(b)) {
                    for (Entry<Integer, Integer> entry : map.entrySet()) {
                        if (entry.getValue().equals(b)) {
                            a = entry.getKey();
                        }
                    }
                    System.out.println(a + " " + b);
                    break;
                }
                else
                    map.put(i,i);

            }
        }
    }
}
