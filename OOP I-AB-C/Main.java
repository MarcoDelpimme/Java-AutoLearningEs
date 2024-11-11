public class Main {
    public static void main(String[] args) {

        Fanteria f = new Fanteria();
        f.combatti();
        f.specializzazione();
        f.usaEquipaggiamento();

        Artiglieria a = new Artiglieria();
        a.combatti();
        a.specializzazione();
        a.usaEquipaggiamento();

        Poliziotto p = new Poliziotto();
        p.descriviLavoro();
        p.ottieniMatricola();

        Detective d = new Detective();
        d.descriviLavoro();
        d.ottieniMatricola();
    }
}