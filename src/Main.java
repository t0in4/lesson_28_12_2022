import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = a > b ? a : b; // тернарный оператор


        // комментировать Ctrl + Shift + /

       /* if (a > b) {
            max = a;
        } else {
        git config --global user.email "you@example.com"
        git config --global user.name "Your Name"
            max = b;
        }*/

        // тернарный оператор - start
        // result = condition ? trueCase : elseCase;

        // тернарный оператор - end
    }
}