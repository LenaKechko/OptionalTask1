import java.util.Scanner;

/*Найти число, состоящее только из различных цифр.
Если таких чисел несколько, найти первое из них.*/
public class OptionalTask07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        String number = "";
        for(String el : numbers) {
            boolean flag = true;
            String temp_el = el;
            while(!temp_el.isEmpty()) {
                char symbol = temp_el.charAt(0);
                int count = 0;
                int index = -1;
                while ((index = temp_el.indexOf(symbol)) != -1) {
                    count++;
                    temp_el = temp_el.substring(0, index) + temp_el.substring(index + 1);
                }
                if (count >= 2) {
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
            System.out.println("Нет чисел удовлетворяющих условию!");
        } else {
            System.out.println("Число, состоящее только из различных цифр - " + number);
        }
    }
}
