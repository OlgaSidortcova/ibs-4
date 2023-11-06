import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое дробное с точкой - разделителем дробной части ");
        double i = scanner.nextDouble();

        System.out.println("Введите второе дробное число с точкой - разделителем дробной части ");
        double j = scanner.nextDouble();

        System.out.println("Введите операцию калькулятора:\n 1 - умножение,\n 2 - сложение,\n" +
                " 3 - вычитание,\n 4 - деление");
        int op = scanner.nextInt();

        if ((op != 1) && (op != 2) && (op != 3) && (op != 4)) {
            System.out.println("Вы ввели некорректное значение операции");
        } else {
            System.out.println("Результат операции ");
            Calculator calculator = new Calculator(i, j, op);
            System.out.println(calculator.makeCalculation());
        }
        scanner.close();
    }

}
