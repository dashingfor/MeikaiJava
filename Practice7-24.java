// Practice7-24
public class Practice {
    static int[] arrayRmvOf(int[] a, int idx) {
        int[] rmv = new int[a.length - 1];
        for (int i = 0; i < idx; i++) {
            rmv[i] = a[i];
        }
        for (int i = idx; i < a.length - 1; i++) 
            rmv[i] = a[i + 1];
        return rmv;
    }
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 7, 9, 11};
        int[] x = arrayRmvOf(a, 2);
        
        // 输出结果数组
        System.out.print("x = { ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("}");
    }
}
