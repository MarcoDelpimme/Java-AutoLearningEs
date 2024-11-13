public class Villain extends Character implements MagicAttack, MeleeAttack {
    int magicPower;
    int physicalPower;

    public Villain(String name, int health, int magicPower, int physicalPower) {
        super(name, health);
        this.magicPower = magicPower;
        this.physicalPower = physicalPower;

    }

    public void enhanceMaginc(int amount) {
        this.magicPower += amount;
        System.out.println("Magic Power: " + this.magicPower);
    }

    public void enhancePhysical(int amount) {
        this.physicalPower += amount;
        System.out.println("Physical Power: " + this.physicalPower);
    }

    public void performAttack() {
        System.out.println("Villain performs a melee attack with power of " + this.physicalPower + ".");
    }

    public void castSpell() {
        System.out.println("Villain casts a magic spell with power of " + this.magicPower + ".");
    }

    public String getStats() {
        return "Name: " + name + "\nHealth: " + health + "\nMagic Power: " + magicPower + "\nPhysical Power: "
                + physicalPower;
    }

    @Override
    public void displayCharacterStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Magic Power: " + magicPower);
        System.out.println("Physical Power: " + physicalPower);
        System.out.println();
    }
}
