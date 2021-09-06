import java.util.Scanner;

/*Ввести n чисел с консоли.
Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.*/
public class OptionalTask04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        int count_min = 257;
        String number = "";
        for (String el : numbers) {
            int i = 0, count = 0;
            String temp_el = el;
            while (!temp_el.isEmpty()) {
                char symbol = temp_el.charAt(0);
                count++;
                int index;
                while ((index = temp_el.indexOf(symbol)) != -1) {
                    temp_el = temp_el.substring(0, index) + temp_el.substring(index + 1);
                }
            }
            System.out.println(el + " - " + count);
            if (count < count_min) {
                number = el;
                count_min = count;
            }
        }
        System.out.println("Число с наименьшим количеством различных цифр - " + number);
    }
}
