import java.util.Scanner;

public class Calculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Для выхода из программы в любой момент введите 'exit'");

        while (true) {
            double value1 = getDouble();
            char operation = getOperation();
            double value2 = getDouble();
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
        Addition addition = new Addition(value1, value2);
        Subtraction subtraction = new Subtraction(value1, value2);
        Division division = new Division(value1, value2);
        Multiplication multiplication = new Multiplication(value1, value2);
        Exponentiation exponentiation = new Exponentiation(value1, value2);

        switch (operation) {
            case '+':
                addition.execute();
                break;
            case '-':
                subtraction.execute();
                break;
            case '*':
                multiplication.execute();
                break;
            case '/':
                division.execute();
                break;
            case '^':
                exponentiation.execute();
                break;
        }
    }
}
