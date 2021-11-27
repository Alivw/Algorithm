package p13t114;

/**
 * @Author: Alivv
 * @Create: 2021-11-27 09:50
 **/
public class Test {

    /**
     * 给定一个字符串 s 和一个字符 x ，编写递归算法实现下列功能：
     * 1、检查 x 是否在 s 中
     * 2、计算 x 在 s 中出现的次数
     * 3、删除 s 中所有 x
     */

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(contain(str, 'p',str.length()-1));

        for (int i = 0; i < str.length(); i++) {
            System.out.print(countTarget(str, str.charAt(i), str.length() - 1) +" ");
        }
    }

    /**
     * 1问 题解
     * @param str
     * @param target
     * @param index
     * @return
     */
    private static boolean contain(String str, char target, int index) {
        if (index >= 0) {
            if (str.charAt(index) == target) {
                return true;
            }

            return contain(str, target, index-1);
        }
        return false;
    }

    private static int countTarget(String str, char target, int index) {
        int count=0;
        if (index >= 0) {
            if (str.charAt(index) == target) {
                count = 1;
            }

            count += countTarget(str, target, index - 1);
        }
        return count;
    }
}
