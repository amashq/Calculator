public class Subtraction extends Operation {

    public Subtraction(double firstValue, double secondValue) {
        super(firstValue, secondValue);
    }

    private double result = getFirstValue() - getSecondValue();

    @Override
    public void execute() {
        System.out.println("Результат: " + result);
    };
}
