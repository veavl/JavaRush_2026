package module1.level_01.lecture_05;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Привет. Это калькулятор.");
        System.out.println("Поочередно ведите, два числа и выражение для вычисления. " +
                "\nНапример '3', '2' и умножить '*'");

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Число №1: ");
            double d1 = sc.nextDouble();
            System.out.print("Число №2: ");
            double d2 = sc.nextDouble();
            sc.nextLine(); // Очищаем буфер от символа переноса строки. Альтернатива: считывать ВСЕ в строки
            System.out.print("Выражение: ");
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
            else System.out.println("Вы сделали что-то не так!");

            System.out.println(result);
            //return;
        }
    }
}
