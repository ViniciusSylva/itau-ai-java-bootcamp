import java.util.Scanner;

public class RestoZero {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número que seja divisível por 2 (resto 0): ");
        int number = scanner.nextInt();
        if (number % 2 != 0) {
            System.out.println("O número digitado não é divisível por 2 (resto 0).");
        } else {
            System.out.println("O número digitado é divisível por 2 (resto 0).");
        }

        while (number % 2 != 0) {
            System.out.printf("Digite um número que seja divisível por 2 e tenha resto 0, obs: maior que o último digitado (%s): ", number);
            int ultimoNum = scanner.nextInt();

            if (number >= ultimoNum) {
                System.out.println("O número digitado não é maior que o último digitado.");
                continue;
            } else if (ultimoNum % 2 != 0) {
                System.out.println("O número digitado não é divisível por 2 (resto 0).");
                continue;
            } else {
                System.out.println("O número digitado é divisível por 2 (resto 0) e maior que o último digitado.");
            }

            number = ultimoNum;
        }

        scanner.close();

    }


}
