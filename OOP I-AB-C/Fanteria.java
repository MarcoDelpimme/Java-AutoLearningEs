public class Fanteria extends Soldato implements Specialista {

    public Fanteria() {
        this.name = "Giorgio";
        this.cognome = "Caleid";
        this.grado = 5;
    }

    @Override
    public void combatti() {
        System.out.println(
                "Sono " + this.name + " " + this.cognome + "  un soldato di fanteria e mi occupo di combattere.");
    }

    @Override
    public void specializzazione() {
        System.out.println(" mi occupo di sparare col m4.");
    }

    @Override
    public void usaEquipaggiamento() {
        System.out.println(" e indosso un tutore cibernetico.");
    }
}
