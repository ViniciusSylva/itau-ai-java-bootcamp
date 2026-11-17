import java.util.Scanner;

public class repetitionStructure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um número: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("A soma dos números de 1 a " + number + " é: " + sum);
        scanner.close();
    }
}
