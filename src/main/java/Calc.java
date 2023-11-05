import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое дробное с точкой - разделителем дробной части ");
        double i = scanner.nextDouble();
        //  Number n1 = new Number(scanner.nextDouble());

        System.out.println("Введите второе дробное число с точкой - разделителем дробной части ");
        double j = scanner.nextDouble();
        // Number n2 = new Number(scanner.nextDouble());

        System.out.println("Введите операцию калькулятора:\n 1 - умножение,\n 2 - сложение,\n" +
                " 3 - вычитание,\n 4 - деление");
        //  Operation calculator = new Calculator(scanner.nextInt());
        int op = scanner.nextInt();


        System.out.println("Результат операции ");
        //  switch (calculator.getOperation()) {
        //     case 1:
        //          System.out.printf("%.4f", calculator.getMultiplication(n1,n2));
        //          break;
        //       case 2:
        //           System.out.printf("%.4f", calculator.getAddition(n1,n2));
        //           break;
        //        case 3:
        //            System.out.printf("%.4f", calculator.getSubtraction(n1,n2));
        //           break;
        //       case 4:
       // if (j == 0) {
       //     System.out.println("Делить на ноль нельзя");
     //   } else
            if ((op != 1) && (op != 2) && (op != 3) && (op != 4)) {
            System.out.println("Вы ввели некорректное значение операции");
        } else {
            Calculator calculator = new Calculator(i, j, op);
            System.out.println(calculator.makeCalculation());
            scanner.close();
        }
    }

}
