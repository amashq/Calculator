public class Division extends Operation {

    public Division(double firstValue, double secondValue) {
        super(firstValue, secondValue);
    }

    @Override
    public void execute() {
        if (getSecondValue() == 0) {
            System.out.println("Деление на ноль невозможно");
        } else {
            System.out.println("Результат: " + (getFirstValue() / getSecondValue()));
        }
    };
}

