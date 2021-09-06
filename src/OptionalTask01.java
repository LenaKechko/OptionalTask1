import java.util.*;
import java.util.stream.Collectors;

/*Ввести n чисел с консоли.
Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.*/

public class OptionalTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> numbers = Arrays.asList(sc.nextLine().split(" "));
        numbers.sort(Comparator.comparingInt(String::length));
        System.out.println("Самое короткое слово - " + numbers.get(0) + ", его длина = " + numbers.get(0).length());
        System.out.println("Самое длинное слово - " + numbers.get(numbers.size() - 1) + ", его длина = " + numbers.get(numbers.size() - 1).length());
    }

}
