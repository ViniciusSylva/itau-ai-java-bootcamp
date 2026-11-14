import java.util.Scanner;

public class nameAge {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        var name = scanner.nextLine();
        System.out.print("Digite a idade: ");
        var age = scanner.nextInt();
        System.out.printf("Nome: %s, Idade: %d%n", name, age);
        scanner.close();
    }
}
