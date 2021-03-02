import java.util.Scanner;

public class Calculator {

    private static Scanner scanner = new Scanner(System.in);

    private static Addition addition;
    private static Subtraction subtraction;
    private static  Division division;
    private static Multiplication multiplication;
    private static Exponentiation exponentiation;

    public static void main(String[] args) {

        System.out.println("Для выхода из программы в любой момент введите 'exit'");

        double value1;
        double value2;
        char operation;

        while (true) {
            value1 = getDouble();
            operation = getOperation();
            value2 = getDouble();
            calc(value1, value2, operation);
        }
    }

    public static double getDouble(){
        System.out.println("Введите число:");
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else {
            if (scanner.hasNext("exit")) System.exit(0);
            System.out.println("При вводе числа допущена ошибка. " +
                    "Если вы вводили дробное число, введите его через запятую. Попробуйте еще раз.");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию (+, -, *, /, ^):");
        char operation;
        if(scanner.hasNext("[+-/^*]")) {
            operation = scanner.next().charAt(0);
        } else {
            if (scanner.hasNext("exit")) System.exit(0);
            System.out.println("При вводе операции допущена ошибка. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static void calc(double value1, double value2, char operation){

        switch (operation) {
            case '+':
                addition = new Addition(value1, value2);
                addition.execute();
                break;
            case '-':
                subtraction = new Subtraction(value1, value2);
                subtraction.execute();
                break;
            case '*':
                multiplication = new Multiplication(value1, value2);
                multiplication.execute();
                break;
            case '/':
                division = new Division(value1, value2);
                division.execute();
                break;
            case '^':
                exponentiation = new Exponentiation(value1, value2);
                exponentiation.execute();
                break;
        }
    }
}
