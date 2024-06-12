// actual file name is ShapeTester1.java
package chap12.shape2;
import java.util.Scanner;
// Practice 13-1
public class ShapeTester1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("图形的个数：");
        int n = stdIn.nextInt();

        // 创建Shape数组
        Shape[] p = new Shape[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + "号图形的种类（1···点/2···横线/3···竖线/4···长方形）：");
            int shapeType = stdIn.nextInt();
            switch (shapeType) {
                case 1: 
                    p[i] = new Point();   
                    break;
                case 2: 
                    System.out.print("长度：");
                    p[i] = new HorzLine(stdIn.nextInt());
                    break;
                case 3:
                    System.out.print("长度：");
                    p[i] = new VertLine(stdIn.nextInt());
                    break;
                case 4:
                    System.out.print("长：");
                    int width = stdIn.nextInt();
                    System.out.print("宽：");
                    int height = stdIn.nextInt();
                    p[i] = new Rectangle(width, height);
            }
        }
        // 显示图形
        for (Shape s : p) {
            s.print();
            System.out.println();
        }
    }
}
