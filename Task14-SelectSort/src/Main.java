import java.util.Arrays;

/**
 * @Author: shizuwei
 * @Create: 2021-10-17 10:51
 **/
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 5, 6, 2, 8, 1};
        new Main().selectSort(arr);
        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
    }

    /**
     * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
     *
     * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
     *
     * 重复第二步，直到所有元素均排序完毕。
     * @param: arr
     * @return void
     * @author Shi Zuwei on 2021/10/17 11:01
     */
    public void selectSort(int[] arr) {
        // 总共经过 n-1 轮比较
        for (int i = 0; i < arr.length - 1; i++) {
            // 每轮需要比较的次数
            for (int j = i + 1; j < arr.length; j++) {
                int min = i;
                if (arr[j] < arr[i]) {
                    min = j;
                }

                if (min != i) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
