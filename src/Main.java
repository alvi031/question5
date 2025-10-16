import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[][] triangle = {{-1},
                {2, 3},
                {1, -1, -3},
                {4,  2,  1, 3}
        };
        System.out.println(minPath(triangle));
    }

    public static int minPath(int[][] triangle) {
        int[] fin = triangle[triangle.length - 1].clone();

        for (int i = triangle.length - 2; i >= 0; i--) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println("fin["+j +"] = " + (triangle[i][j] + Math.min(fin[j], fin[j + 1])));
                fin[j] = triangle[i][j] + Math.min(fin[j], fin[j + 1]);
                System.out.println(Arrays.toString(fin));
            }
        }
        return fin[0];
    }
}
