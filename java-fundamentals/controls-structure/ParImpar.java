import java.util.Scanner;

public class ParImpar {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número interio: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número interio: ");
        int num2 = scanner.nextInt();

        String escolha;
        do {
            System.out.printf("Você deseja ver os numeros pares um ímpares entre o primeiro(%s) e o segundo(%s) número digitado? (Digite 'par' ou 'impar')\n", num1, num2);
            escolha = scanner.next();
        } while (!escolha.equalsIgnoreCase("par") && !escolha.equalsIgnoreCase("impar"));

        if (escolha.equalsIgnoreCase("par")) {
            System.out.printf("Os números pares entre %s e %s são: ", num1, num2);
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (escolha.equalsIgnoreCase("impar")) {
            System.out.printf("Os números ímpares entre %s e %s são: ", num1, num2);
            for (int i = num1; i <= num2; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Opção inválida. Por favor, digite 'par' ou 'impar'.");
        }

        scanner.close();
    } 

}
