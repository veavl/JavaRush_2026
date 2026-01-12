// package module1.level_01.lecture_05;

// КАЛЬКУЛЯТОР - ПЕРЕДАЧА АРГУМЕНТОВ В МЕТОД MAIN ИЗ КОМАНДНОЙ СТРОКИ
public class CalcArgsCommand {

    public static void main(String[] args) {

        while (true) {
            if (args.length != 3) {
                System.out.println("Передайте 3 аргумента в метод main");
                return;
            } else {
                for (String s: args)
                    System.out.println(s);
                break;
            }
        }

        // System.out.println("Длинна массива args: " + args.length);
    }

}
