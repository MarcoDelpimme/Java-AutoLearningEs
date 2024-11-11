public class Artiglieria extends Soldato implements Specialista {

    public Artiglieria() {
        this.name = "Mario";
        this.cognome = "Rossi";
        this.grado = 1;
    }

    @Override
    public void combatti() {
        System.out.println(
                "Sono " + this.name + " " + this.cognome + " un soldato di artiglieria e mi occupo di combattere.");
    }

    @Override
    public void specializzazione() {
        System.out.println(" e piazzo esplosivi.");
    }

    @Override
    public void usaEquipaggiamento() {
        System.out.println("e uso m429.");
    }

}
