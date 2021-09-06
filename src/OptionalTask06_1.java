import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/*Найти число, цифры в котором идут в строгом порядке возрастания.
Если таких чисел несколько, найти первое из них. */


public class OptionalTask06_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = 0;
        for (int el : numbers) {
            int temp = el;
            boolean flag = true;
            int a = el % 10;
            el /= 10;
            while (el != 0) {
                int b = el % 10;
                el /= 10;
                if (a < b) {
                    flag = false;
                    break;
                }
                a = b;
            }
            if (flag) {
                number = temp;
                break;
            }
        }
        int finalNumber = number;
        if (IntStream.of(numbers).anyMatch(x->x== finalNumber)) {
            System.out.println("Число, цифры в котором идут в строгом порядке возрастания - " + number);
        } else {
            System.out.println("Ни одно число не удовлетворяет условию!!!");
        }
    }
}
