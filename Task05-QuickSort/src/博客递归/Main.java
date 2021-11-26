package 博客递归;

import java.util.Arrays;

/**
 * @Author: Alivv
 * @Create: 2021-11-25 11:36
 **/
public class Main {
    public static void main(String[] args) {
        int[] arr = {23, 45, 17, 11, 13, 89, 72, 26, 3, 17, 11, 13};
        System.out.println(Arrays.toString(arr));
        int start = 0, end = arr.length - 1;
        quickSort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start>=end) return;

        int temp = arr[start], i = start, j = end;

        while (i < j) {

            while (i < j && arr[j] >= temp) {
                j--;
            }
            arr[i] = arr[j];

            while (i < j && arr[i] < temp) {
                i++;
            }

            arr[j] = arr[i];

        }

        arr[i] = temp;
        quickSort(arr, 0, start - 1);
        quickSort(arr, start + 1, end);

    }
}
