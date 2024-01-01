import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            Map<Integer, Integer> digitCountMap = new HashMap<>();

            digitCountMap.put(a, digitCountMap.getOrDefault(a, 0) + 1);

            digitCountMap.put(b, digitCountMap.getOrDefault(b, 0) + 1);

            digitCountMap.put(c, digitCountMap.getOrDefault(c, 0) + 1);

            for (Map.Entry<Integer, Integer> entry : digitCountMap.entrySet()) {
                if (entry.getValue() == 1) {
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
    }
}
