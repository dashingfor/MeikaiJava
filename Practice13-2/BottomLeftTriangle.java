package chap12.shape2;

public class BottomLeftTriangle extends IsoscelesTriangle {
    public BottomLeftTriangle(int legLength) { super(legLength); }
    public String toString() {
        return "BottomLeftTriangle(legLength:" + getLegLength() + ")";
    }
    public void draw() {
        for (int i = 1; i <= getLegLength(); i++) {
            for (int j = 1; j <= i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
