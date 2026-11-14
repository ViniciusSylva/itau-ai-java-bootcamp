import java.util.Scanner;

public class ages {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite a 1° idade: ");
        var age1 = scanner.nextInt();
        System.out.print("Digite a 2° idade: ");
        var age2 = scanner.nextInt();
        var result = Math.abs(age1 - age2);
        System.out.printf("A diferença de idade é: %d%n", result);
        scanner.close();
    }

}