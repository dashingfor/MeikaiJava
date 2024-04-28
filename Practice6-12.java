import java.util.Scanner;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        // 输入元素个数
        System.out.print("元素个数：");
        int num = stdIn.nextInt();
        // 随机分配元素的值
        int[] a = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = rand.nextInt(100);
        }
        // 随机前的数组顺序
        System.out.print("数组a：\na = { ");
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("}");
        // 随机排列数组中的元素
        for (int i = 0; i < num; i++) {
            int t = a[i];
            int idx = rand.nextInt(num);
            a[i] = a[idx];
            a[idx] = t;
        }
        // 随机后的数组顺序
        System.out.print("随机执行完毕。\n数组a：\na = { ");
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("}");
    }
}
