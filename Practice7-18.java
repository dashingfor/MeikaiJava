import java.util.Random;
import java.util.Scanner;
// Practice7-18
public class Practice {
    static void aryRmv(int[] a, int idx) {
        for (int i = idx; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("元素个数：");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        aryRmv(x, 4);

        System.out.println("已删除。");
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }
}
