package module1.level_01.lecture_05;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Привет. Это калькулятор.");
        System.out.println("Поочередно ведите, два числа и выражение для вычисления. " +
                "\nНапример '3', '2' и умножить '*'");

        Scanner sc = new Scanner(System.in);

        double d1;
        while (true) {
            System.out.print("Введите число №1: ");
            String string1 = sc.nextLine();
            if (string1.isEmpty()) {
                System.out.println("Пустая строка!");
                continue;
            }
            try {
                d1 = Double.parseDouble(string1);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите число.");
            }
        }

        double d2;
        while (true) {
            System.out.print("Введите число №2: ");
            String string2 = sc.nextLine();
            if (string2.isEmpty()) {
                System.out.println("Пустая строка!");
                continue;
            }
            try {
                d2 = Double.parseDouble(string2);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите число.");
            }
        }

        double result = 0;
        while (true) {
            System.out.print("Введите выражение: ");
            String operation = sc.nextLine();

            if (operation.equals("/") && d2 == 0) {
                System.out.println("Ошибка! Декление на ноль не возможно. Введите другое выражение");
                continue;
            }
            if (operation.equals("*"))
                result = d1 * d2;
            else if (operation.equals("+"))
                result = d1 + d2;
            else if (operation.equals("/"))
                result = d1 / d2;
            else if (operation.equals("-"))
                result = d1 - d2;
            else {
                System.out.println("Неизвестная операция");
                continue;
            }
            break;
        }
        System.out.println("Результат: " + result);

//            switch (operation) {
//                case "+":
//                    result = d1 + d2;
//                    break;
//                case "-":
//                    result = d1 - d2;
//                    break;
//                case "*":
//                    result = d1 * d2;
//                    break;
//                case "/":
//                    result = d1 / d2;
//                    break;
//                default:
//                    System.out.println("Неизвестная операция");
//                    return;
//            }

    }
}
