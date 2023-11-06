public class Division implements Operation {
    public double calculateResult(double first, double second) throws ArithmeticException {
        if (second == 0) {
            throw new ArithmeticException();
        }
        return first / second;
    }
}


