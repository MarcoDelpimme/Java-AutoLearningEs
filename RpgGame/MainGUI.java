import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {
    private Hero hero;
    private Villain villain;
    private JLabel heroStatsLabel;
    private JLabel villainStatsLabel;
    private JTextArea gameLog;

    public MainGUI() {
        String heroName = JOptionPane.showInputDialog(null, "Inserisci il nome del tuo eroe:");
        int heroHealth = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserisci la salute del tuo eroe:"));
        int heroPhysicalPower = Integer
                .parseInt(JOptionPane.showInputDialog(null, "Inserisci la potenza fisica del tuo eroe:"));
        hero = new Hero(heroName, heroHealth, heroPhysicalPower);
        villain = new Villain("Stalker", 100, 50, 50);

        JFrame frame = new JFrame("CHEATRPG");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        gameLog = new JTextArea(10, 50);
        gameLog.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(gameLog);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel statsPanel = new JPanel(new GridLayout(2, 1));
        heroStatsLabel = new JLabel(hero.getStats());
        villainStatsLabel = new JLabel(villain.getStats());
        statsPanel.add(heroStatsLabel);
        statsPanel.add(villainStatsLabel);
        frame.add(statsPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        JButton attackButton = new JButton("Attacco fisico");
        JButton magicPotionButton = new JButton("Usa pozione magica");
        JButton physicalPotionButton = new JButton("Usa pozione fisica");
        JButton passTurnButton = new JButton("Passa il turno");

        buttonPanel.add(attackButton);
        buttonPanel.add(magicPotionButton);
        buttonPanel.add(physicalPotionButton);
        buttonPanel.add(passTurnButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        attackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hero.performAttack();
                villain.health -= hero.physicalPower;
                updateGameLog(hero.name + " ha attaccato il cattivo. Salute del cattivo: " + villain.health);
                checkGameStatus();
            }
        });

        magicPotionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MagicPotion magicPotion = new MagicPotion();
                magicPotion.applyPotion(hero);
                updateGameLog(hero.name + " ha usato una pozione magica!");
                updateStats();
            }
        });

        physicalPotionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PhysicalPot physicalPot = new PhysicalPot();
                physicalPot.applyPotion(hero);
                updateGameLog(hero.name + " ha usato una pozione fisica!");
                updateStats();
            }
        });

        passTurnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateGameLog(hero.name + " ha passato il turno.");
                villainTurn();
            }
        });

        frame.setVisible(true);
    }

    private void updateGameLog(String message) {
        gameLog.append(message + "\n");
    }

    private void updateStats() {
        heroStatsLabel.setText(hero.getStats());
        villainStatsLabel.setText(villain.getStats());
    }

    private void villainTurn() {
        int action = (int) (Math.random() * 2) + 1;
        if (action == 1) {
            villain.performAttack();
            hero.health -= villain.physicalPower;
            updateGameLog("Il cattivo ha attaccato. Salute dell'eroe: " + hero.health);
        } else {
            villain.castSpell();
            hero.health -= villain.magicPower;
            updateGameLog("Il cattivo ha lanciato un incantesimo. Salute dell'eroe: " + hero.health);
        }
        updateStats();
        checkGameStatus();
    }

    private void checkGameStatus() {
        if (villain.health <= 0) {
            updateGameLog("Hai sconfitto il cattivo!");
            disableButtons();
        } else if (hero.health <= 0) {
            updateGameLog("Sei stato sconfitto!");
            disableButtons();
        }
    }

    private void disableButtons() {
        for (Component c : ((JPanel) heroStatsLabel.getParent().getParent().getComponent(2)).getComponents()) {
            c.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}
