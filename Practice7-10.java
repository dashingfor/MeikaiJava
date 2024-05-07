import java.util.Random;
import java.util.Scanner;
// Practice7-10
public class Practice {
    static Scanner stdIn = new Scanner(System.in);

    static boolean confirmRetry() {
        int cont;
        do {
            System.out.print("再来一次？<Yes...1/No...0>");
            cont = stdIn.nextInt();
        } while (cont != 0 && cont != 1);
        return cont == 1;   // 返回值是true
    }

    static void plusPlus(int x, int y, int z) {
        while (true) {
            System.out.print(x + " + " + y + " + " + z + " = ");
            int k = stdIn.nextInt();     // 读入的值
            if (k == x + y + z)  
                break;
            System.out.println("回答错误！！");
        }
    }

    static void plusMinus(int x, int y, int z) {
        while (true) {
            System.out.print(x + " + " + y + " - " + z + " = ");
            int k = stdIn.nextInt();     // 读入的值
            if (k == x + y - z)  
                break;
            System.out.println("回答错误！！");
        }
    }

    static void minusPlus(int x, int y, int z) {
        while (true) {
            System.out.print(x + " - " + y + " + " + z + " = ");
            int k = stdIn.nextInt();     // 读入的值
            if (k == x - y + z)  
                break;
            System.out.println("回答错误！！");
        }
    }

    static void minusMinus(int x, int y, int z) {
        while (true) {
            System.out.print(x + " - " + y + " - " + z + " = ");
            int k = stdIn.nextInt();     // 读入的值
            if (k == x - y - z)  
                break;
            System.out.println("回答错误！！");
        }
    }
    
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("心算能力训练！！");
        do {
            int x = rand.nextInt(900) + 100;  // 3位数
            int y = rand.nextInt(900) + 100;  // 3位数
            int z = rand.nextInt(900) + 100;  // 3位数 

            int choice = rand.nextInt(4);
            switch (choice) {
                case 0:
                    plusPlus(x, y, z);
                    break;
                case 1:
                    plusMinus(x, y, z);
                    break;
                case 2:
                    minusPlus(x, y, z);
                    break;
                case 3:
                    minusMinus(x, y, z);
                    break;
            }
        } while (confirmRetry());
    }
}
