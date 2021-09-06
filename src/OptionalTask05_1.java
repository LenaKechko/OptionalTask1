/*Найти количество чисел, содержащих только четные цифры,
а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.*/

import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask05_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count_all_even = 0, count_half_even = 0;
        for (int el : numbers) {
            int count_odd = 0, count_even = 0;
            int temp = el;
            while (temp != 0) {
                int num = temp % 10;
                if (num % 2 == 0) {
                    count_even++;
                } else {
                    count_odd++;
                }
                temp /= 10;
            }
            if (count_even == (Integer.toString(el)).length()) {
                count_all_even++;
            } else if (count_odd == count_even && count_odd + count_even == (Integer.toString(el)).length()) {
                count_half_even++;
            }
        }
        System.out.println("Количество чисел, содержащих только четные цифры = " + count_all_even);
        System.out.println("Количество чисел с равным числом четных и нечетных цифр = " + count_half_even);
    }
}
