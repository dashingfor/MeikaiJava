public class DistanceCar extends Car {
    private double overallDistance;    // 行驶距离（总）

    //--- 构造函数 ---//
    public DistanceCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
        super(name, width, height, length, fuel, purchaseDay);
        overallDistance = 0.0;
    }

    //--- 重写移动方法 ---//
    public boolean move(double dx, double dy) {
        if (super.move(dx, dy)) {
            overallDistance += Math.sqrt(dx * dx + dy * dy);
        }
        return super.move(dx, dy);
    }

    //--- 确认总移动距离 ---//
    public double getDist() {
        return overallDistance;
    }
}
