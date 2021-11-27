import java.util.Arrays;

/**
 * @Description: 全排列
 * @Author: Awei
 * @Create: 2021-03-26 08:14
 **/
public class QplTest {

    public static int COUNT = 0;

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr = new int[]{1, 2, 3, 4};
//        Perm(arr, 0, arr.length);

        perm(arr, 0);
        System.out.println("一共有" + COUNT + "种方法");
    }


    public static void Perm(int[] list, int k, int m) {
        /*if (k == m - 1) {
            int sum1 = list[0] * 100 + list[1] * 10 + list[2];
            int sum2 = list[3] * 100 + list[4] * 10 + list[5];
            int sum = list[6] * 100 + list[7] * 10 + list[8];
            if (sum1 + sum2 == sum) {
                System.out.println(sum1 + "+" + sum2 + "=" + sum);
                COUNT++;
            }*/
        if (k == m - 1) {
            System.out.println(Arrays.toString(list));
            COUNT++;

        } else {
            for (int i = k; i < m; i++) {
                Swap(list, k, i);
                Perm(list, k + 1, m);
                Swap(list, k, i);
            }
        }
    }


    private static void perm(int[] arr, int start) {
        if (start == arr.length - 1) {
            System.out.println(Arrays.toString(arr));
            COUNT++;
        }

        for (int i = start; i < arr.length; i++) {
            Swap(arr, start, i);
            perm(arr, start+1);
            Swap(arr, start, i );
        }
    }

    private static void Swap(int[] list, int k, int i) {
        int temp = 0;
        temp = list[k];
        list[k] = list[i];
        list[i] = temp;
    }


}
