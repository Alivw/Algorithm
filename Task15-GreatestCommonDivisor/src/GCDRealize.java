/**
 * @Author: shizuwei
 * @Create: 2021-10-21 10:05
 **/
public class GCDRealize {
    public static void main(String[] args) {
        System.out.println("GCD(24, 12) = " + GCD(18, 27));
        int a = 3, b = 4;
        swap(a, b);
        System.out.println( a + "==" + b);
    }


    private static int GCD(int m, int n) {
        int temp = m;
        m = m > n ? temp : n;
        n = m > n ? n : temp;
        if (n == 0 || m == n) return m;
        return GCD(m % n, n);
    }

    public static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
