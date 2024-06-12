package chap12.shape2;
import java.util.Scanner;
public class IsoTriTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("等腰直角三角形的个数：");
        int n = stdIn.nextInt();
        IsoscelesTriangle[] p = new IsoscelesTriangle[n];
        for (int i = 0; i < n; i++) {
            System.out.print("边长：");
            int legLength = stdIn.nextInt();
            System.out.print(i + 1 + "号三角的直角位置：1···左上/2···右上/3···左下/4···右下");
            int position = stdIn.nextInt();
            switch (position) {
                case 1: p[i] = new TopLeftTriangle(legLength); break;
                case 2: p[i] = new TopRightTriangle(legLength); break;
                case 3: p[i] = new BottomLeftTriangle(legLength); break;
                case 4: p[i] = new BottomRightTriangle(legLength); break;
            }
        }

        for (IsoscelesTriangle s : p) {
            s.draw();
            System.out.println();
        }
    }
}
