import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int value = new Scanner(System.in).nextInt();
        int factorial = 1;
        for (int i = 1; i <= value; i = i + 1) {
            factorial  = factorial * i;
        }
        System.out.println("Факториал числа = " + factorial);
    }
}