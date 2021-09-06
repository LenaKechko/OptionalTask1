import java.util.*;

/*Ввести n чисел с консоли. Вывести числа в порядке возрастания (убывания) значений их длины.*/

public class OptionalTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> numbers = Arrays.asList(sc.nextLine().split(" "));
        List<String> numbers_desc = new ArrayList<String>(numbers), numbers_asc = new ArrayList<String>(numbers);
        numbers_asc.sort(Comparator.comparingInt(String::length));
        numbers_desc.sort((s1, s2) -> s2.length() - s1.length());
        System.out.println("По возрастанию длин:");
        System.out.println(numbers_asc);
        System.out.println("По убыванию длин:");
        System.out.println(numbers_desc);
    }
}
