import java.util.Scanner;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("元素个数：");
        int num = stdIn.nextInt();

        int[] a = new int[num];
        a[0] = rand.nextInt(10) + 1;
        for (int i = 1; i < num; i++) {
            int reassign = 0;
            do {
                reassign = 0;     // 重置条件，如果不重置的话循环将无法结束
                a[i] = rand.nextInt(10) + 1;
                for (int j = 0; j < i; j++) {
                    if (a[i] == a[j]) {
                        reassign = 1;
                        break;
                    }
                }
            } while (reassign == 1);
        }

        System.out.print("a = { ");
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("}");
    }
}
