import java.util.Scanner;
// Practice6-18
public class Practice {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int[][] array;
        System.out.print("array行数：");
        int row = stdIn.nextInt();
        array = new int[row][]; 
        
        for (int i = 0; i < row; i++) {
            System.out.printf("array[%d]列数：", i);
            array[i] = new int[stdIn.nextInt()];
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("array[%d][%d]元素值：", i, j);
                array[i][j] = stdIn.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
