package module1.level_01.lecture_05;

import java.util.Scanner;       // ++ 'ОДОБРЕНО КУ' -- ЭТИ КОММЕНТЫ КУ ОДОБРИЛ - ОСТАЛЬНЫЕ ИЗБЫТОЧНЫЕ

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Привет. Это калькулятор.");
        System.out.println("Поочередно ведите, два числа и выражение для вычисления. " +
                "\nНапример '3', '2' и умножить '*'");

        Scanner sc = new Scanner(System.in);

        double d1;
        while (true) {                              // ЭТОТ ЦИКЛ ПРЕРВЕТСЯ ТОЛЬКО BREAK-ОМ ++ 'ОДОБРЕНО КУ'
            System.out.print("Введите число №1: ");
            String string1 = sc.nextLine();
            if (string1.isEmpty()) {                // ПРИ ПУСТОЙ СТРОКЕ...
                System.out.println("Пустая строка!");
                continue;                           // ... ВОЗВРАЩАЕМСЯ В НАЧАЛО ЦИКЛА
            }
            try {                                   // ПРОБУЕМ
                d1 = Double.parseDouble(string1);   // ЕСЛИ ПОЛУЧАЕТСЯ ПАРСИНГ СТРОКИ В ЧИСЛО...
                break;                              // ... BREAK - КОНЕЦ ЦИКЛА
            } catch (NumberFormatException e) {     // ИНАЧЕ
                System.out.println("Ошибка! Введите число."); // ВЫВОДИМ СООБЩЕНИЕ И ЦИКЛ ПРОДОЛЖАЕТСЯ
            }
        }

        double d2;                              // АНАЛОГИЧНЫЙ ЦИКЛ КАК И ДЛЯ d1 ++ 'ОДОБРЕНО КУ'
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
        while (true) {          // ЦИКЛ ДЛЯ ПРОВЕРКИ И ПОЛУЧЕНИЯ АРИФ. ОПЕРАЦИИ - ВЫРАЖЕНИЯ ++ 'ОДОБРЕНО КУ'
            System.out.print("Введите выражение: ");
            String operation = sc.nextLine();
                                                        // ++ 'ОДОБРЕНО КУ'
            if (operation.equals("/") && d2 == 0) {     // ЕСЛИ МЫ ДЕЛИМ И ВТОРОЕ ЧИСЛО РАВНО 0 ...
                System.out.println("Ошибка! Декление на ноль не возможно. Введите другое выражение");
                continue;                               // ... ВОЗВРАТ В НАЧАЛО ЦИКЛА
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
                System.out.println("Неизвестная операция");     // ЕСЛИ ВВЕЛИ НЕ АРИФ. ОПЕРЦИЮ ...
                continue;                                       // ... ВОЗВРАЩАЕМСЯ В НАЧАЛО ЦИКЛА
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
