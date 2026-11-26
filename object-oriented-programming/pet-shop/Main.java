import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final PerMachine petMachine = new PerMachine();

    public static void main(String[] args) {
        while (true) {
            System.out.println("==== Escolha uma opção ====");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");

            int option;
            try {
                option = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException exception) {
                System.out.println("Opção inválida. Digite um número de 0 a 9.");
                continue;
            }

            switch (option) {
                case 0 -> {
                    System.out.println("Até logo!");
                    return;
                }
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                default -> System.out.println("Opção inválida. Digite um número de 0 a 9.");
            }
        }
    }

    private static void setWater() {
        petMachine.addWater();
    }

    private static void setShampoo() {
        petMachine.addShampoo();
    }

    private static void verifyWater() {
        System.out.println("A máquina tem " + petMachine.getWater() + " litros de água.");
    }

    private static void verifyShampoo() {
        System.out.println("A máquina tem " + petMachine.getShampoo() + " litros de shampoo.");
    }

    private static void checkIfHasPetInMachine() {
        System.out.println(
            petMachine.hasPet()
                ? "Tem um pet na máquina."
                : "Não tem nenhum pet na máquina."
        );
    }

    private static void setPetInPetMachine() {
        String name;
        do {
            System.out.println("Digite o nome do pet:");
            name = scanner.nextLine().trim();
        } while (name.isEmpty());

        Pet pet = new Pet(name);
        if (petMachine.setPet(pet)) {
            System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
        }
    }
}
