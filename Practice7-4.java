// Practice7-4
public class Practice {
    static int sumUp(int n) {
        int sum = 0;
        while (n-- > 0) 
            sum += n;
        return sum;       
    }
    public static void main(String[] args) {
        System.out.println(sumUp(5));           // 想要直接使用需要static静态方法，否则需要创建对象
    }
}
