import java.util.InputMismatchException;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i = 1;
        double j = 1;
        int op = 1;

        try {
            System.out.println("Введите первое дробное число с точкой - разделителем дробной части ");
            i = scanner.nextDouble();

            System.out.println("Введите второе дробное число с точкой - разделителем дробной части ");
            j = scanner.nextDouble();

            System.out.println("Введите операцию калькулятора:\n 1 - умножение,\n 2 - сложение,\n" +
                    " 3 - вычитание,\n 4 - деление");
            op = scanner.nextInt();

            System.out.println("Результат операции ");
            Calculator calculator = new Calculator();
            System.out.printf("%.4f", calculator.makeCalculation(i, j, op));

        } catch (InputMismatchException e) {
            System.out.println("Произошла ошибка при обработке операнда или оператора: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Результат операции отсуствует, т.к. на ноль делить нельзя");
        }
        scanner.close();
    }
}
