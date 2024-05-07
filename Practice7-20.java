import java.util.Random;
import java.util.Scanner;
// Practice7-20
public class Practice {
    static void aryIns(int[] a, int idx, int x) {
        for (int i = a.length - 1; i > idx; i--) {
            a[i] = a[i - 1];
        }
        a[idx] = x;
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

        aryIns(x, 3, 99);

        System.out.println("插入完成。");
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }
}
