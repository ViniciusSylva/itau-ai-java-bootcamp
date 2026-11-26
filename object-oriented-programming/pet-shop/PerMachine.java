public class PerMachine {

    private static final int MAX_WATER = 30;
    private static final int MAX_SHAMPOO = 10;
    private static final int RESOURCE_USE = 2;

    private boolean clean = true;

    private int water = MAX_WATER;

    private int shampoo = MAX_SHAMPOO;

    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        if (this.pet.isClean()) {
            System.out.println("O pet já está limpo.");
            return;
        }

        if (this.water < RESOURCE_USE || this.shampoo < RESOURCE_USE) {
            System.out.println("Água ou shampoo insuficiente para dar banho.");
            return;
        }

        this.water -= RESOURCE_USE;
        this.shampoo -= RESOURCE_USE;
        this.pet.setClean(true);
        this.clean = false;
        System.out.println("O pet " + this.pet.getName() + " está limpo!");
    }

    public void addWater() {
        if (this.water == MAX_WATER) {
            System.out.println("A capacidade de água está no máximo.");
            return;
        }

        this.water = Math.min(this.water + RESOURCE_USE, MAX_WATER);
        System.out.println("Água abastecida. Nível atual: " + this.water + " litros.");
    }

    public void addShampoo() {
        if (this.shampoo == MAX_SHAMPOO) {
            System.out.println("A capacidade de shampoo está no máximo.");
            return;
        }

        this.shampoo = Math.min(this.shampoo + RESOURCE_USE, MAX_SHAMPOO);
        System.out.println("Shampoo abastecido. Nível atual: " + this.shampoo + " litros.");
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return this.pet != null;
    }

    public boolean setPet(Pet pet) {
        if (pet == null) {
            System.out.println("Pet inválido.");
            return false;
        }
        if (!this.clean) {
            System.out.println("A máquina precisa ser limpa antes de colocar um pet.");
            return false;
        }

        if (this.pet != null) {
            System.out.println("O pet " + this.pet.getName() + " já está na máquina.");
            return false;
        }

        this.pet = pet;
        return true;
    }

    public void removePet() {
        if (this.pet == null) {
            System.out.println("Não há pet na máquina para retirar.");
            return;
        }

        String petName = this.pet.getName();
        boolean petIsClean = this.pet.isClean();
        this.pet = null;
        System.out.println(
            petIsClean
                ? "O pet " + petName + " foi retirado limpo."
                : "O pet " + petName + " foi retirado sem banho."
        );
    }

    public void wash() {
        if (this.pet != null) {
            System.out.println("Retire o pet antes de limpar a máquina.");
            return;
        }

        if (this.clean) {
            System.out.println("A máquina já está limpa.");
            return;
        }

        if (this.water < RESOURCE_USE || this.shampoo < RESOURCE_USE) {
            System.out.println("Água ou shampoo insuficiente para limpar a máquina.");
            return;
        }

        this.water -= RESOURCE_USE;
        this.shampoo -= RESOURCE_USE;
        this.clean = true;
        System.out.println("A máquina está limpa!");
    }

}