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
        int start = 0, end = arr.length -1;
        quickSort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];      //将区间的第一个数作为基准数

            int i=start,j=end;

            while (i < j) {

                //当右边的数大于基准数时，略过，继续向左查找
                //不满足条件时跳出循环，此时的j对应的元素是小于基准元素的
                while (i < j && arr[j] > temp)
                    j--;

                //将右边小于等于基准元素的数填入右边相应位置
                arr[i] = arr[j];

                //当左边的数小于等于基准数时，略过，继续向右查找
                //(重复的基准元素集合到左区间)
                //不满足条件时跳出循环，此时的i对应的元素是大于等于基准元素的
                while (i < j && arr[i] <= temp)
                    i++;

                //将左边大于基准元素的数填入左边相应位置
                arr[j] = arr[i];
            }

            arr[i] = temp;
            quickSort(arr, 0, start - 1);
            quickSort(arr, start + 1, end);
        } else return;


    }
}
