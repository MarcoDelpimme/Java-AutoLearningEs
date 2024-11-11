public class Hero extends Character implements MeleeAttack {
    int physicalPower;

    public Hero(String name, int health, int physicalPower) {
        super(name, health);
        this.physicalPower = physicalPower;

    }

    public void performAttack() {
        System.out.println("Hero performs a melee attack with power of " + this.physicalPower + ".");
    }

    void enhancePhysical(int amount) {
        this.physicalPower += amount;
    }

    @Override
    public void displayCharacterStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Physical Power: " + physicalPower);
        System.out.println();

    }

}
