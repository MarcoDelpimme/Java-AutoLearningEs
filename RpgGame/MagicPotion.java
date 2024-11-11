public class MagicPotion extends Potion {

    public MagicPotion() {

        super("Magic Potion");
    }

    @Override
    public void applyPotion(Character character) {
        if (character instanceof Hero) {
            Villain villain = (Villain) character;
            villain.enhanceMaginc(10);
            System.out.println("applied " + character.name + " Magic Power increase ");
            System.out.println();

        } else {
            System.out.println("no effect");
            System.out.println();

        }

    }

}