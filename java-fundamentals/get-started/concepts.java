import java.util.Scanner;

public class concepts {

    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome: ";

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print(WELCOME_MESSAGE);
        var name = scanner.next();
        System.out.print("Olá, " + name + "! Informe sua idade:");
        var age = scanner.nextInt(); 
        System.out.printf("%s, você tem %d anos.", name, age);
        scanner.close();
    }
}