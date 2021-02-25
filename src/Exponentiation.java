public class Exponentiation extends Operation {

    public Exponentiation(double firstValue, double secondValue) {
        super(firstValue, secondValue);
    }

    private double result = Math.pow(getFirstValue(), getSecondValue());

    @Override
    public void execute() {
        System.out.println("Результат: " + result);
    };
}
