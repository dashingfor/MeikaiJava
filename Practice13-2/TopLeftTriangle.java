package chap12.shape2;

public class TopLeftTriangle extends IsoscelesTriangle {
    public TopLeftTriangle(int legLength) { super(legLength); }
    public String toString() {
        return "TopLeftTriangle(legLength:" + getLegLength() + ")";
    }
    public void draw() {
        for (int i = getLegLength(); i > 0; i--) {
            for (int j = i; j > 0; j--)
                System.out.print('*');
            System.out.println();
        }
    }
}
