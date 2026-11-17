import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        var name = scanner.next();
        System.out.print("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.print("Você é emancipado? (s/n): ");
        var emancipated = scanner.next().equalsIgnoreCase("s");

        if (age >= 18) {
            System.out.println(name + ", você é de maior e pode tirar a sua CNH.");
        } else if (age >= 16 && emancipated) {
            System.out.println(name + ", apesar de não ser maior de idade, você é emancipado e pode tirar a sua CNH.");
        } else {
            System.out.println(name + ", você não pode tirar a sua CNH.");
        }
        scanner.close();
    }
    
    
}
