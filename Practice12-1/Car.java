// 汽车类【第2版】
public class Car {
    private String name;
    private int width;
    private int height;
    private int length;
    private double x;
    private double y;
    private double fuel;
    private Day purchaseDay;  // 购买日期

    //--- 构造函数 ---//
    public Car(String name, int width, int height, int length, double fuel, Day purchaseDay) {
        this.name = name;       this.width = width;   this.height = height;
        this.length = length;   this.fuel = fuel;     x = y = 0.0;
        this.purchaseDay = new Day(purchaseDay);
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getFuel() {return fuel; }
    public Day getPurchaseDay() {
        return new Day(purchaseDay);
    }

    //--- 显示型号 ---//
    public void putSpec() {
        System.out.println("名称：" + name);
        System.out.println("车宽：" + width  + "mm");
        System.out.println("车高：" + height + "mm");
        System.out.println("车厂：" + length + "mm");
    }

    //--- 向x方向移动dx、向y方向移动dy ---//
    public boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy);      // 移动距离

        if (dist > fuel)
            return false;        // 无法移动 ··· 燃料不足
        else {
            fuel -= dist;        // 减掉移动距离所消耗的燃料
            x += dx;
            y += dy;
            return true;         // 移动结束
        }
    }
}
