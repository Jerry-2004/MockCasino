package blackjack;

import main.Constants;
import main.Game;

import javax.swing.*;
import java.awt.*;

public class Blackjack extends JFrame implements Game {

    public Blackjack() {
        initialise();
    }

    @Override
    public void start() {
        setVisible(true);
    }

    private void initialise() {
        setTitle(Constants.BLACKJACK_TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());
    }
}
