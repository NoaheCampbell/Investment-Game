package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class GameControl implements Runnable, ActionListener
{
    private GameState state;
    private GameView view;
    private Timer timer;

    public GameControl()
    {

    }

    public void run()
    {
        state = new GameState();

        view = new GameView(state);

        state.addGameObject(new StartMenu(state, 250, 250, 200, 100));

        timer = new Timer(17, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e)
    {
        state.updateAll();

        state.changeIsMouseClicked(false);

        view.repaint();
    }
}
