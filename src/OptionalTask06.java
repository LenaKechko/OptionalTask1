import java.util.Scanner;

/*Найти число, цифры в котором идут в строгом порядке возрастания.
Если таких чисел несколько, найти первое из них. */

//Сделано с помощью строк
public class OptionalTask06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        String number = "";
        for (String el : numbers) {
            boolean flag = true;
            for (int i = 0; i < el.length() - 1; i++) {
                if (el.charAt(i) >= el.charAt(i + 1)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                number = el;
                break;
            }
        }
        if (number.isEmpty()) {
            System.out.println("Ни одно число не удовлетворяет условию!!!");
        } else {
            System.out.println("Число, цифры в котором идут в строгом порядке возрастания - " + number);
        }
    }
}
