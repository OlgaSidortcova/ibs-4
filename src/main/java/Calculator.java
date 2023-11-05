public class Calculator {

    private double first;
    private double second;
    private int operation;
    private double result;

    public Calculator(double first, double second, int operation) {
        this.first = first;
        this.second = second;
        this.operation = operation;
         this.result = makeCalculation();

    }
public double makeCalculation(){
    switch (operation) {
        case 1:
          Addition add = new Addition();
            double result = add.calculateResult(first, second);
          return result;

        case 2:
            Addition add1 = new Addition();
            double result1 = add1.calculateResult(first, second);
            return result1;

        case 3:
            Addition add2 = new Addition();
            double result2 = add2.calculateResult(first, second);
            return result2;

        default:
        Addition add3 = new Addition();
            double result3 = add3.calculateResult(first, second);
            return result3;
            }

    }
}



