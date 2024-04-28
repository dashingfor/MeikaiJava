import java.util.Scanner;
import java.util.Random;
// 练习6-4
public class helloworld {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("元素个数：");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = 1 + rand.nextInt(10);

        // 纵向柱状图
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= (10 - a[j]))
                    System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }

        // 底部列的标识
        for (int i = 0; i < n - 1; i++) {
            System.out.print("--");
        }
        System.out.println('-');

        for (int i = 0; i < n; i++) {
            System.out.print(i % 10 + " ");
        }
        System.out.println();
    }
}

/* 题干
 * 请编写一段程序，改写代码清单6-5，像图中P169那样显示为纵向柱形图。
 * 最下面一行显示索引除以10的余数。
 */

/* 算法:
 * 打印是横向的，首先需要确定在一行中是打印空格还是打印字符
 * 用for循环，i代表行数。随机数的范围是1～10，所以i < 10
 * j是列数。a[j]代表这一行的柱状图高度，也就是*的个数。
 * 10-a[j]代表了这一列空格的行数。如果行数大于空格的行数，就打印字符*
 * 如果i大于等于10-a[i]，那么这一行的这个位置就要打印空格，反之打印字符
 * 最后一行对照表上面的位置用for循环标注。
 */
