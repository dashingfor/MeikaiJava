public class DistanceCarTester {
    public static void main(String[] args) {
        DistanceCar myCar = new DistanceCar("爱车", 1885, 1490, 5220, 90.0, new Day(2000, 11, 18));
        myCar.putSpec();
        System.out.println("购买日期：" + myCar.getPurchaseDay().toString());
        System.out.printf("车的位置为(%.2f, %.2f)\n", myCar.getX(), myCar.getY());
        System.out.println(myCar.move(3, 4.4));
        System.out.printf("移动的距离是%.2f\n", myCar.getDist());
        System.out.printf("车的位置为(%.2f, %.2f)\n", myCar.getX(), myCar.getY());
        System.out.println(myCar.move(4.2, 6.4));
        System.out.printf("车的位置为(%.2f, %.2f)\n", myCar.getX(), myCar.getY());
        System.out.println(myCar.move(14.2, 16.4));
        System.out.printf("车的位置为(%.2f, %.2f)\n", myCar.getX(), myCar.getY());
        System.out.printf("移动的距离是%.2f\n", myCar.getDist());
        System.out.println(myCar.move(24.2, 16.4));
        System.out.printf("车的位置为(%.2f, %.2f)\n", myCar.getX(), myCar.getY());
        System.out.printf("移动的距离是%.2f\n", myCar.getDist());
    }
}
