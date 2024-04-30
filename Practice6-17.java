import java.util.Scanner;
// 假设每个学生的成绩是整数
public class Practice {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        final int person = 6;  // 人数为6人
        final int course = 2;  // 语文、数学2科

        int[][] a = new int[person][course];  
        // 读入学生成绩
        for (int i = 0; i < person; i++) {
            for (int j = 0; j < course; j++) {
                if (j == 0)
                    System.out.printf("%d号同学的语文成绩为：", i);
                else
                    System.out.printf("%d号同学的数学成绩为：", i);
                a[i][j] = stdIn.nextInt();
            }
        }

        // 计算每科平均分
        double[] avec = new double[course];
        for (int i = 0; i < course; i++) {
            double sum = 0.0;
            for (int j = 0; j < person; j++) {
                sum += a[j][i];
            }
            avec[i] = sum / person;
        }

        // 计算每个人平均分
        double[] avep = new double[person];
        for (int i = 0; i < person; i++) {
            double sum = 0.0;
            for (int j = 0; j < course; j++) {
                sum += a[i][j];
            }
            avep[i] = sum / course;
        }

        // 显示成绩和平均分
        System.out.println("    语文 数学");
        for (int i = 0; i < person; i++) {
            System.out.printf("%d号：", i);
            for (int j = 0; j < course; j++) {
                System.out.printf("%d   ", a[i][j]);
            }
            System.out.println();
        }

        // 显示每科平均分
        System.out.println("  平均(语文·数学)");
        for (int i = 0; i < course; i++) {
            System.out.printf("   %.1f", avec[i]);
        }
        System.out.println();

        // 显示每个人的平均分
        for (int i = 0; i < person; i++) {
            System.err.println(i + "号同学：" + avep[i]);
        }
    }
}
