abstract class Potion {
    String name;

    public Potion(String name) {
        this.name = name;
    }

    abstract void applyPotion(Character character);
}
