import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero("Hobbit", 100, 50);
        Villain villain = new Villain("Stalker", 100, 50, 50);
        Character character = new Hero("Gandalf", 100, 50);

        villain.displayCharacterStats();
        hero.displayCharacterStats();

        hero.performAttack();

        villain.performAttack();
        villain.castSpell();

        MagicPotion magicPotion = new MagicPotion();
        PhysicalPot physicalPot = new PhysicalPot();

        // if (villain instanceof MagicAttack) {
        // villain.enhanceMaginc(10);
        // System.out.println("applied" + villain.name + "Magic Power increase ");
        // } else {
        // System.out.println("no effect on " + villain.name);
        // }

        magicPotion.applyPotion(villain);
        physicalPot.applyPotion(hero);

        magicPotion.applyPotion(villain);
        physicalPot.applyPotion(hero);

        hero.displayCharacterStats();
        villain.displayCharacterStats();

        if (character instanceof Hero) {
            ((Hero) character).enhancePhysical(10);

            System.out.println("applied" + character.name + "Physical Power increase");
            character.displayCharacterStats();
        } else {
            System.out.println("no effect on " + character.name);
        }
    }
}
