import java.util.Scanner;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        
        int[][] a = new int[4][3];
        int[][] b = new int[3][4];
        int[][] c = new int[a.length][b[0].length];

        // input values of a & b
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("a[%d][%d] = ", i, j);
                a[i][j] = stdIn.nextInt();
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.printf("b[%d][%d] = ", i, j);
                b[i][j] = stdIn.nextInt();
            }
        }

        // a * b = c
        // 乘积C的第m行第n列的元素等于矩阵A的第m行的元素与矩阵B的第n列对应元素乘积之和。
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {  // 重点：当a和b的元素分别相加的时候，c的元素不变。
                    c[i][j] += a[i][k] + b[k][j];     // 所以需要3个for循环，前两个用来给c定位，第三个for循环的和前两个结合起来算结果。
                }
            }
        }

        // print a & b
        System.out.println("矩阵a");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
        System.out.println("矩阵b");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.printf("%d ", b[i][j]);
            }
            System.out.println();
        }
        System.out.println("矩阵c");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println();
        }
    }
}
