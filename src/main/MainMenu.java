package main;

import blackjack.Blackjack;
import roulette.Roulette;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {

    public MainMenu() {
        initialise();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainMenu menu = new MainMenu();
            menu.setVisible(true);
        });

    }

    private void initialise() {
        setTitle("%s | %s".formatted(Constants.CASINO_TITLE, Constants.MENU_TITLE));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new GridLayout(4, 1));

        JLabel welcomeLabel = new JLabel(Constants.WELCOME_MESSAGE, JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(welcomeLabel);

        JButton rouletteButton = new JButton("Play Roulette");
        JButton blackjackButton = new JButton("Play Blackjack");

        add(rouletteButton);
        add(blackjackButton);

        initialiseActionListeners(rouletteButton, blackjackButton);
    }

    private void initialiseActionListeners(JButton rouletteButton, JButton blackjackButton) {
        rouletteButton.addActionListener(e -> {
            new Roulette().setVisible(true);
            dispose();
        });

        blackjackButton.addActionListener(e -> {
            new Blackjack().setVisible(true);
            dispose();
        });
    }
}