package TicTac;

import javax.swing.*;

public class Winning extends JFrame {
    private String textWinner;
    static final int WINDOW_WIDTH = 300;
    static final int WINDOW_HEIGHT = 300;

    public Winning(String textWinner){
        this.textWinner = textWinner;

        setBounds(GameWindow.WINDOW_X + 100, GameWindow.WINDOW_Y + 100, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Game over");
        setVisible(true);
        add(new JLabel(textWinner));
    }
}
