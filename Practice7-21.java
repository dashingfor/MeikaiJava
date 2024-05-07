// Practice7-21
// Refined by chat GPT
public class Practice {
    static void aryExchng(int[] a, int[] b) {
        // refined part
        int min = 0;
        if (a.length <= b.length)
            min = a.length;
        else 
            min = b.length;
        for (int i = 0; i < min; i++) {
            int t = a[i];
            a[i] = b[i];
            b[i] = t;
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {5, 4, 3, 2, 1};
        aryExchng(a, b);
        
        System.out.print("a = { ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("}");

        System.out.print("b = { ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("}");
    }
}


// 我第一次写的交换逻辑
// 固定了数组a小于等于数组b，如果不符合就交换数组ab
// 元素交换后再换回来
// static void aryExchng(int[] a, int[] b) {
//     int exchng = 0;
//     if (a.length > b.length) {
//         int[] t = a;
//         a = b;
//         b = t;
//         exchng = 1;
//     }
//     for (int i = 0; i < a.length; i++) {
//         int t = a[i];
//         a[i] = b[i];
//         b[i] = t;
//     }
//     if (exchng == 1) {
//         int[] t = a;
//         a = b;
//         b = t;
//     }
// }


// gpt改的交换逻辑
// 不需要确定数组ab的长度关系
// 只需要确定更短的数组长度直接换就行
// 因为确定了更短的数组长度
// 进行交换就不会超出另一个的长度
// 所以不需要专门换引用目标
