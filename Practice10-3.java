public class MinMax {
    static int min(int a, int b) {
        int min = a;
        if (b < a) min = b;
        return min;
    }

    static int min(int a, int b, int c) {
        int min = a;
        if (b < a) min = b;
        if (c < b) min = c;
        return min;
    }
    
    static int min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) min = a[i];
        }
        return min;
    }

    static double min(double a, double b) {
        double min = a;
        if (b < a) min = b;
        return min;
    }

    static double min(double a, double b, double c) {
        double min = a;
        if (b < a) min = b;
        if (c < b) min = c;
        return min;
    }
    
    static double min(double[] a) {
        double min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) min = a[i];
        }
        return min;
    }

    static int max(int a, int b) {
        int max = a;
        if (b > a) max = b;
        return max;
    }

    static int max(int a, int b, int c) {
        int max = a;
        if (b > a) max = b;
        if (c > b) max = c;
        return max;
    }
    
    static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    static double max(double a, double b) {
        double max = a;
        if (b > a) max = b;
        return max;
    }

    static double max(double a, double b, double c) {
        double max = a;
        if (b > a) max = b;
        if (c > b) max = c;
        return max;
    }
    
    static double max(double[] a) {
        double max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }
}
