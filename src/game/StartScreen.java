package game;

import java.awt.*;

public class StartScreen implements OnScreen
{
    private GameState state;
    private int x, y;
    private int height, width;

    public StartScreen(GameState state, int x, int y, int height, int width)
    {
        this.state = state;
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }


    public void update()
    {
        // Checks to see if the user clicked on the screen at a specific location, and if they did, it removes
        // that object that was clicked on, and then adds the main menu for the player to choose from.
        if(!state.isGameStarted() && state.isMouseClicked() &&
                (state.getMouseLocation().x >= this.x && state.getMouseLocation().y >= this.y) &&
                (state.getMouseLocation().x <= (this.x + getWidth() / 2) && state.getMouseLocation().y <= (this.y + getHeight() / 2)))
        {
            state.changeIsGameStarted(true);
            state.addGameObject(new MainMenu(state));
            state.removeGameObject(this);
        }
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(250, 250, 100, 50);
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public Point getLocation()
    {
        return new Point(x, y);
    }
}
