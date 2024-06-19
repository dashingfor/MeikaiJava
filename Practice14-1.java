public class ShapeTester {
    public static void main(String[] args) {
        Plane2D[] a = new Plane2D[2];
        a[0] = new Rectangle(3, 5);
        a[1] = new Parallelogram(2, 4);

        for (Plane2D p : a) {
            System.out.println(p.getArea());
        }
    }
}
