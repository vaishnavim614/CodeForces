import java.util.Scanner;

public class latin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            char[][] arr = new char[3][3];
            for (int i = 0; i < 3; i++) {
                String rowInput = scanner.next();
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = rowInput.charAt(j);
                }
            }
            int a = 0, b = 0, c = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (arr[i][j] == 'A')
                        a++;
                    else if (arr[i][j] == 'B') {
                        b++;
                    } else
                        c++;
                }
            }
            if (a == 2)
                System.out.println("A");
            else if (b == 2) {
                System.out.println("B");
            } else
                System.out.println("C");
        }


    }
}
