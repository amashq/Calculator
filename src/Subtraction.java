public class Subtraction extends Operation {

    public Subtraction(double firstValue, double secondValue) {
        super(firstValue, secondValue);
    }

    @Override
    public void execute() {
        System.out.println("Результат: " + (getFirstValue() - getSecondValue()));
    };
}
