import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Угадайте число от 1 до 100");
        int value = new Random().nextInt(100);
        while (true) {
            int attempt = new Scanner(System.in).nextInt();
            if (attempt == value) {
                System.out.println("Вы угадали!");
                break;
            } else if (attempt < value) {
                System.out.println("Загаданное число меньше");
                continue;
            } else {
                System.out.println("Загаданное число больше");
                continue;
            }
        }
    }
}