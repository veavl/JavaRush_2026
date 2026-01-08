package module1.level_01.lecture_05;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Привет. Это калькулятор.");
        System.out.println("Поочередно ведите, два числа и выражение для вычисления. " +
                "\nНапример '3', '2' и умножить '*'");

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Введите число №1: ");
            double d1 = sc.nextDouble();
            System.out.print("Введите число №2: ");
            double d2 = sc.nextDouble();

            sc.nextLine(); // Очищаем буфер от символа переноса строки. Альтернатива: считывать ВСЕ в строки
            System.out.print("Введите выражение: ");
            String operation = sc.nextLine();

            

            double result = 0;

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
                return;
            }

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

            System.out.println(result);
        }
    }
}
