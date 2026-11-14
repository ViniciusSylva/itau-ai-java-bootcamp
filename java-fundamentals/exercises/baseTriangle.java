import java.util.Scanner;

public class baseTriangle {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Insira quantos cm/mt² é a área do triângulo: ");
        var area = scanner.nextInt();
        System.out.print("Insira quantos cm/mt² é a altura do triângulo: ");
        var altura = scanner.nextInt();
        var base = (2 * area) / altura;
        System.out.printf("O valor da base do triângulo é: %dcm/mt² \n", base);
        scanner.close();
    }

}
