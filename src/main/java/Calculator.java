public class Calculator {
    private double first;
    private double second;
    private int operation;

    public Calculator(double first, double second, int operation) {
        this.first = first;
        this.second = second;
        this.operation = operation;
    }

    public double makeCalculation() {
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
            default:
                Division div = new Division();
                return div.calculateResult(first, second);
        }
    }
}



