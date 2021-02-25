public class Addition extends Operation {

    public Addition(double firstValue, double secondValue) {
        super(firstValue, secondValue);
    }

    private double result = getFirstValue() + getSecondValue();

    @Override
    public void execute() {
        System.out.println("Сумма равна: " + result);
    };
}
