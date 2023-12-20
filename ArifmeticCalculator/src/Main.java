public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    ArithmeticCalculator calculator =
            new ArithmeticCalculator(56, 12);
System.out.println("Сложение: " +
        calculator.calculate(EnamOperation.ADD));
System.out.println("Вычитание: " +
        calculator.calculate(EnamOperation.SUBTRACT));
System.out.println("Умножение: " +
        calculator.calculate(Operation.MULTIPLY));
}