// Practice7-23
public class Practice {
    static int[] arraySrchIdx(int[] a, int x) {
        int idxLength = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                idxLength++;
        }
        int[] idx = new int[idxLength];
        int index = 0;
        for (int i = 0;i < a.length; i++) {
            if (a[i] == x) {
                idx[index] = i;
                index++;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] a = {1, 5, 4, 8, 5, 5, 7};
        int[] ans = arraySrchIdx(a, 5);
        
        System.out.print("ans = { ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("}");
    }
}
