import java.util.InputMismatchException;

public class Calculator {

    public Calculator() {
    }

    public double makeCalculation(double first, double second, int operation) throws InputMismatchException {
        switch (operation) {
            //  1 - умножение, 2 - сложение, 3 - вычитание, 4 - деление
            case 1:
                Multiplication mu = new Multiplication();
                return mu.calculateResult(first, second);
            case 2:
                Addition add = new Addition();
                return add.calculateResult(first, second);
            case 3:
                Subtraction sb = new Subtraction();
                return sb.calculateResult(first, second);
            case 4:
                Division div = new Division();
                return div.calculateResult(first, second);
            default:
                throw new InputMismatchException();
        }
    }
}



