public class Multiplication extends Operation {

    public Multiplication(double firstValue, double secondValue) {
        super(firstValue, secondValue);
    }

    private double result = getFirstValue() * getSecondValue();

    @Override
    public void execute() {
        System.out.println("Результат: " + result);
    };
}
