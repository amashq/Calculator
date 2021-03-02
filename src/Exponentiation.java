public class Exponentiation extends Operation {

    Exponentiation(double firstValue, double secondValue) {
        super(firstValue, secondValue);
    }

    @Override
    public void execute() {
        System.out.println("Результат: " + Math.pow(getFirstValue(), getSecondValue()));
    };
}
