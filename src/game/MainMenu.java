package game;

import java.awt.*;

public class MainMenu implements OnScreen
{
    GameState state;
    public MainMenu(GameState state)
    {
        this.state = state;
    }

    public void update()
    {

    }

    public void draw(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(100, 100, 100, 100);
        g.drawString("Redo", 100, 100);
    }
}
