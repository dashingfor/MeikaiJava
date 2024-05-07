import java.util.Random;
import java.util.Scanner;
// Practice7-19
public class Practice {
    static void aryRmvN(int[] a, int idx, int n) {
        for (int i = idx; i < idx + n; i++) {
            if (i + n < a.length)
                a[i] = a[i + n];
            else
                break;
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

        aryRmvN(x, 1, 3);

        System.out.println("已删除。");
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }
}
