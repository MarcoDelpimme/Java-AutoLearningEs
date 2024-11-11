public class PhysicalPot extends Potion {
    public PhysicalPot() {
        super("Physical Potion");
    }

    @Override
    void applyPotion(Character character) {
        if (character instanceof MeleeAttack) {
            if (character instanceof Villain) {
                Villain villain = (Villain) character;
                villain.enhancePhysical(10);
            } else if (character instanceof Hero) {
                Hero hero = (Hero) character;
                hero.enhancePhysical(10);
            }
            System.out.println("applied " + character.name + " Physical Power increase ");
            System.out.println();

        } else {
            System.out.println("no effect on " + character.name);
            System.out.println();

        }
    }
}
