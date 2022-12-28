import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // первый случай использования тернарного оператор - start
        int max = a > b ? a : b; // тернарный оператор
        // комментировать Ctrl + Shift + /
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        // первый случай использования тернарного оператор - end

        // второй случай использования тернарного оператора - start
        String result = a == b ? "equal" :
                a > b ? "more" : "less";
        if (a == b) {
            result = "равно";
        } else if (a > b) {
            result = "больше";
        } else {
            result = "меньше";
        }
        // второй случай использования тернарного оператора - end

        // тернарный оператор - start
        // result = condition ? trueCase : elseCase;

        // тернарный оператор - end
    }
}