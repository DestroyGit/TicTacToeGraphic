package TicTac;

import javax.swing.*;

public class Winning extends JFrame {
    static final int WINDOW_WIDTH = 100;
    static final int WINDOW_HEIGHT = 100;

    public void Winning(){
        setBounds(GameWindow.WINDOW_X + 100, GameWindow.WINDOW_Y + 100, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Game over");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        add(new JLabel("Some win"));
    }
}
