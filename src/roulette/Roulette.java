package roulette;

import main.Constants;
import main.Game;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.stream.IntStream;

public class Roulette extends JFrame implements Game {

    private List<Integer> numbers;

    public Roulette() {
        initialise();
    }

    @Override
    public void start() {
        setVisible(true);
    }

    private void initialise() {
        setTitle(Constants.ROULETTE_TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());
    }

    private List<Integer> getNumbers() {
        if (numbers.size() == 0) {
            populateNumbers();
        }
        return numbers;
    }

    private void populateNumbers() {
        numbers = IntStream.rangeClosed(0, 36).boxed().toList();
    }

}

