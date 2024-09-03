import java.util.Scanner;

public class Fibonnaci {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int number) {
        if (number == 0 || number == 1) {
            return true;
        }

        int first = 0;
        int second = 1;
        int next = first + second;

        while (next <= number) {
            if (next == number) {
                return true;
            }
            first = second;
            second = next;
            next = first + second;
        }

        return false;
    }

}
