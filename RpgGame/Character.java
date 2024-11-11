abstract class Character {

    String name;
    int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    abstract void displayCharacterStats();

}