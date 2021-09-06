import java.util.Scanner;

/*Найти количество чисел, содержащих только четные цифры,
а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.*/
public class OptionalTask05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        int count_all_even = 0, count_half_even = 0;
        for (String el : numbers) {
            int count_odd = 0, count_even = 0;
            for (int i = 0; i < el.length(); i++) {
                int number = el.charAt(i);
                if (number == 0) {
                    continue;
                }
                if (number % 2 == 0) {
                    count_even++;
                } else {
                    count_odd++;
                }
            }
            if (count_even == el.length()) {
                count_all_even++;
            } else if (count_odd == count_even && count_odd + count_even == el.length()) {
                count_half_even++;
            }
        }
        System.out.println("Количество чисел, содержащих только четные цифры = " + count_all_even);
        System.out.println("Количество чисел с равным числом четных и нечетных цифр = " + count_half_even);
    }
}
