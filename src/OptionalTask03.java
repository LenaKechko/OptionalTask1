import java.util.Scanner;

/*Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.*/
public class OptionalTask03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        int sum = 0;
        for (String el : numbers) {
            sum += el.length();
        }
        double sr_length = (double) sum / numbers.length;
        System.out.printf("Средяя длина чисел равна %.3f\n", sr_length);
        System.out.println("Числа,длина которых меньше средней длины:");
        for (String el : numbers) {
            if (el.length() < sr_length) {
                System.out.println(el);
            }
        }
        System.out.println("Числа,длина которых больше средней длины:");
        for (String el : numbers) {
            if (el.length() > sr_length) {
                System.out.println(el);
            }
        }
    }
}
