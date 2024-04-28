// 练习6-7
import java.util.Scanner;
import java.util.Random;
public class helloworld {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        final int n = 12;
        int[] a = new int[n];

        for (int j = 0; j < n; j++)
            a[j] = rand.nextInt(10);

        System.out.print("数组a中全部元素的值\n{ ");
        for (int j = 0; j < n; j++)
            System.out.print(a[j] + " ");
        System.out.println("}");

        System.out.println("要查找的数值：");
        int key = stdIn.nextInt();

        int i;
        for (i = n - 1; i >= 0; i--)
            if (a[i] == key)
                break;
        
        if (i >= 0)
            System.out.println("该元素是a[" + i + "]。");
        else
            System.out.println("该元素不存在。");
    }
}
