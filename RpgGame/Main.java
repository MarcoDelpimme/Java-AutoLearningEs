import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        new MainGUI();
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Benvenuto! Crea il tuo personaggio.");
        // System.out.print("Inserisci il nome del tuo eroe: ");
        // String heroName = scanner.nextLine();
        // System.out.print("Inserisci la salute del tuo eroe: ");
        // int heroHealth = scanner.nextInt();
        // System.out.print("Inserisci la potenza fisica del tuo eroe: ");
        // int heroPhysicalPower = scanner.nextInt();

        // Hero hero = new Hero(heroName, heroHealth, heroPhysicalPower);
        // Villain villain = new Villain("Stalker", 100, 50, 50);

        // MagicPotion magicPotion = new MagicPotion();
        // PhysicalPot physicalPot = new PhysicalPot();

        // System.out.println("\nIl tuo eroe è stato creato!");
        // hero.displayCharacterStats();
        // System.out.println("Il tuo avversario è:");
        // villain.displayCharacterStats();

        // boolean gameRunning = true;
        // while (gameRunning) {

        // System.out.println("\n--- Turno dell'eroe ---");
        // System.out.println("1. Attacco fisico");
        // System.out.println("2. Usa pozione magica");
        // System.out.println("3. Usa pozione fisica");
        // System.out.println("4. Passa il turno");
        // System.out.print("Scegli un'azione: ");
        // int action = scanner.nextInt();

        // switch (action) {
        // case 1:
        // hero.performAttack();
        // villain.health -= hero.physicalPower;
        // System.out.println("Il cattivo subisce danni. Salute attuale: " +
        // villain.health);
        // break;
        // case 2:
        // magicPotion.applyPotion(hero);
        // System.out.println("Hai usato una pozione magica!");
        // break;
        // case 3:
        // physicalPot.applyPotion(hero);
        // System.out.println("Hai usato una pozione fisica!");
        // break;
        // case 4:
        // System.out.println(hero.name + " passa il turno.");
        // break;
        // default:
        // System.out.println("Azione non valida! Perdi il turno.");
        // }

        // if (villain.health <= 0) {
        // System.out.println("Hai sconfitto il cattivo!");
        // break;
        // }

        // System.out.println("\n--- Turno del cattivo ---");
        // int villainAction = (int) (Math.random() * 2) + 1;
        // if (villainAction == 1) {
        // villain.performAttack();
        // hero.health -= villain.physicalPower;
        // System.out.println("Il tuo eroe subisce danni fisici. Salute attuale: " +
        // hero.health);
        // } else {
        // villain.castSpell();
        // hero.health -= villain.magicPower;
        // System.out.println("Il tuo eroe subisce danni magici. Salute attuale: " +
        // hero.health);
        // }

        // if (hero.health <= 0) {
        // System.out.println("Sei stato sconfitto!");
        // break;
        // }

        // try {
        // Thread.sleep(1000);
        // } catch (InterruptedException e) {
        // System.out.println("Il thread è stato interrotto.");
        // }
        // }

        // scanner.close();
        // }
    }
}
