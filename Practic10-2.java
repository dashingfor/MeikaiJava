// 连续编号类
class ExId {
    static int counter = 0;           // 赋到了哪一个标识编号
    static int n = 1;
    private int id;                  // 标识编号     // 练习10-1

    static int getMaxID() {                 // 练习10-1
        return counter;
    }
    
    //--- 构造函数 ---//
    public ExId() {
        counter = counter + n;
        id = counter;                     // 标识编号
    }

    //--- 获取标识编号 ---//
    public int getId() {
        return id;
    }

    //--- set n ---//
    static void setN(int x) {
        n = x;
    }

    //--- get n ---//
    static int getN() {
        return n;
    }
}
public class ExIdTester {
    public static void main(String[] args) {
        ExId a = new ExId();                    // 标识编号1号
        ExId b = new ExId();                    // 标识编号2号

        System.out.println("a的标识编号：" + a.getId());
        System.out.println("b的标识编号：" + b.getId());

        System.out.println("Id.counter = " + ExId.counter);
        System.out.println(" a.counter = " +  a.counter);
        System.out.println(" b.counter = " +  b.counter);
        System.out.println("最大标识编号" + ExId.getMaxID());   

        System.out.println("n = " + ExId.getN());
        ExId.setN(3);
        ExId c = new ExId();
        ExId d = new ExId();
        System.out.println("c的标识编号：" + c.getId());
        System.out.println("d的标识编号：" + d.getId());
        System.out.println("最大标识编号" + ExId.getMaxID()); 
    }
}
