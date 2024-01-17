import java.util.Scanner;

public class Square {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int[][] points = new int[4][2];

                for (int j = 0; j < 4; j++) {
                    points[j][0] = scanner.nextInt();
                    points[j][1] = scanner.nextInt();
                }

            int side = Math.max(Math.abs(points[1][0] - points[0][0]), Math.abs(points[1][1] - points[0][1]));

                int area = side * side;
                System.out.println(area);
        }
    }
}

