package chap12.shape2;

public class TopRightTriangle extends IsoscelesTriangle {
    public TopRightTriangle(int legLength) { super(legLength); }
    public String toString() {
        return "TopRightTriangle(legLength:" + getLegLength() + ")";
    }
    public void draw() {
        for (int i = 0; i < getLegLength(); i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(' ');
            for (int k = getLegLength() - i; k > 0; k--) 
                System.out.print('*');
            System.out.println();
        }
    }
}
