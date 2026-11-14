import java.util.Scanner;

public class areaSquare {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Insira o valor do lado do quadrado: ");
        var side = scanner.nextInt();
        var area = side * side;
        System.out.printf("A área do quadrado de lado %d é %d \n", side, area);
        scanner.close();
    }

}
