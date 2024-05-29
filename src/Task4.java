import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task4 {
    private int[][] triangle;
    private int size;

    public Task4(int size) {
        this.size = size;
        triangle = new int[size][];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = random.nextInt(100);
            }
        }
    }

    public void printTriangle() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int findMaxSumPath() {
        int[][] dp = new int[size][size];


        for (int i = 0; i < size; i++) {
            dp[size - 1][i] = triangle[size - 1][i];
        }


        for (int i = size - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = triangle[i][j] + Math.max(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }


        List<Integer> path = new ArrayList<>();
        int i = 0, j = 0;
        path.add(triangle[i][j]);

        while (i < size - 1) {
            if (dp[i + 1][j] > dp[i + 1][j + 1]) {
                i++;
            } else {
                i++;
                j++;
            }
            path.add(triangle[i][j]);
        }

        System.out.println("Путь с максимальной суммой: " + path);

        return dp[0][0];
    }

    public static void main(String[] args) {
        Task4 triangle = new Task4(5);
        triangle.printTriangle();

        int maxSum = triangle.findMaxSumPath();
        System.out.println("Максимальная сумма: " + maxSum);
    }
}

