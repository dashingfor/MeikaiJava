import java.util.Scanner;
// Practice6-19
public class Practice {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("班级数：");
        int cnum = stdIn.nextInt();
        int[][] grade = new int[cnum][];

        for (int i = 0; i < cnum; i++) {
            System.out.printf("%d班的人数：", i + 1);
            grade[i] = new int[stdIn.nextInt()]; 
            for (int j = 0; j < grade[i].length; j++) {
                System.out.printf("%d班%d号的分数：", i + 1, j + 1);
                grade[i][j] = stdIn.nextInt();
            }
        }

        // 计算总分和平均分的数组
        int[] sum = new int[cnum];
        double[] ave = new double[cnum];
        for (int i = 0; i < cnum; i++) {
            for (int j = 0; j < grade[i].length; j++) {
                sum[i] += grade[i][j];
            }
            ave[i] = (double)sum[i] / grade[i].length;
        }
        // 计算合计的总分和平均分
        int allsum = 0; double allave; int allstu = 0;
        for (int i = 0; i < cnum; i++) {
            allsum += sum[i];
            allstu += grade[i].length;
        }
        allave = (double)allsum / allstu;

        System.out.println(" 班   ｜  总分  平均分");
        System.out.println("------+--------------");
        for (int i = 0; i < cnum; i++) {
            System.out.printf("%d班   |%6d%7.1f\n", i + 1, sum[i], ave[i]);
        }
        System.out.println("------+--------------");
        System.out.printf("合计  |%6d%7.1f\n", allsum, allave);
    }
}
