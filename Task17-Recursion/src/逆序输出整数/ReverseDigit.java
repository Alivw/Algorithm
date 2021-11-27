package 逆序输出整数;

/**
 * @Author: Alivv
 * @Create: 2021-11-27 09:23
 **/
public class ReverseDigit {
    public static void main(String[] args) {
        printDigit(12345);
    }

    private static void printDigit(int n) {
        System.out.print(n % 10);
        if (n >= 10) {
            printDigit(n / 10);
        }
    }
}
