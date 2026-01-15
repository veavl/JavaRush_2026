// package module1.level_01.lecture_05;

// КАЛЬКУЛЯТОР - ПЕРЕДАЧА АРГУМЕНТОВ В МЕТОД MAIN ИЗ КОМАНДНОЙ СТРОКИ
public class CalcArgsCommand {  // РУГАЕТСЯ НА ОТСУТСТВИЕ package -
// - НО С package НУЖНО УКАЗЫВАТЬ ПОЛНЫЙ ПУТЬ В КОМАНДНОЙ СТРОКЕ

    public static void main(String[] args) {

        while (true) {
            if (args.length != 3) {
// ЕСЛИ ИЗ КОМАНДНОЙ СТРОКИ ПЕРЕДАТЬ * (ЗВЕЗДОЧКУ) В МАССИВ ARGS МЕТОДА MAIN...
// ... ТО * ИНТЕРПРЕТИРУЕТСЯ ОБОЛОЧКОЙ КАК WILDCARD (ПОДСТАНОВКА ФАЙЛОВ)...
// ТО ЕСТЬ В МАССИВ ARGS ПОПАДУТ ВСЕ ФАЙЛЫ ТЕКУЩЕГО КАТАЛОГА ВМЕСТО ОДНОГО СИМВОЛА *
                System.out.println("Передайте 3 аргумента в метод main");
                System.out.println("Получено аргументов: " + args.length);
                System.out.println("Аргументы:");
                for (int i = 0; i < args.length; i++) {
                    System.out.println("  [" + i + "] = '" + args[i] + "'");
                }
                return;
            } else {
                for (String s: args) {
                    System.out.println(s);
                }
                double num1 = Double.parseDouble(args[0]);
                double num2 = Double.parseDouble(args[1]);

                String operation = args[2];
                double result = 0;
                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "x":
                    case "X":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Unknow operation");
                        return;
                }
                System.out.println(result);
                break;
            }
        }
        // System.out.println("Длинна массива args: " + args.length);
    }

}
