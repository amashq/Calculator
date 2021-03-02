public class Addition extends Operation {

    Addition(double firstValue, double secondValue) {
        super(firstValue, secondValue);
    }

    @Override
    public void execute() {
        System.out.println("Сумма равна: " + (getFirstValue() + getSecondValue()));
    };
}
