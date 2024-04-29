import java.util.Scanner;
import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        
        int num = rand.nextInt(6) + 5;
        int[] a = new int[num];
        int[] b = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = rand.nextInt(100);
        }

        for (int i = 0; i < num; i++) {
            b[i] = a[num - 1 - i];
        }

        System.out.print("a =  { ");
        for (int i = 0; i < num; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("}");
        System.out.println();

        System.out.print("b =  { ");
        for (int i = 0; i < num; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("}");

    }
}
