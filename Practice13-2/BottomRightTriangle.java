package chap12.shape2;

public class BottomRightTriangle extends IsoscelesTriangle{
    public BottomRightTriangle(int legLength) { super(legLength); }
    public String toString() {
        return "BottomRightTriangle(legLength:" + getLegLength() + ")";
    }
    public void draw() {
        for (int i = getLegLength() - 1; i >= 0; i--) {
            for (int j = i; j > 0; j--)
                System.out.print(' ');
            for (int k = getLegLength() - i; k > 0; k--)
                System.out.print('*');
            System.out.println();
        }
    }
}
