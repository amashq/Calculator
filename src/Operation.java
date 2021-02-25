public class Operation {

    private double firstValue;
    private double secondValue;

    public Operation(double firstValue, double secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public double getFirstValue() {
        return firstValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void execute() {
        System.out.println("Результат");
    };
}
