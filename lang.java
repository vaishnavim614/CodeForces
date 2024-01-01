import java.util.Scanner;

public class lang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            String s = scanner.next();

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {

                if (isConsonant(s.charAt(i))) {
                    if (i + 1 < n && isVowel(s.charAt(i + 1))) {
                        sb.append("." + s.charAt(i) + "" + s.charAt(i + 1));
                        i++;
                    } else {
                        sb.append(s.charAt(i));
                    }
                }
            }
            String ans=sb.toString().substring(1);
            System.out.println(ans);
        }

        scanner.close();
    }

    static boolean isVowel(char c) {

        return c == 'a' || c == 'e';
    }

    static boolean isConsonant(char c) {

        return c == 'b' || c == 'c' || c == 'd';
    }
}
