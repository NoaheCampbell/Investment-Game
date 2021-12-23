package game;

import java.awt.*;

public class MainMenu extends Menu implements OnScreen
{
    

    public MainMenu(GameState state, int x, int y, int height, int width)
    {
        super(state, x, y, height, width);
    }

    public void update()
    {
        // Checks to see if the user clicked on the screen at a specific location, and if they did, it removes
        // that object that was clicked on, and then re-adds the start menu for the player.
        if(state.isGameStarted() && state.isMouseClicked() &&
          (state.getMouseLocation().x >= this.x && state.getMouseLocation().y >= this.y) &&
          (state.getMouseLocation().x <= (this.x + getWidth()) && state.getMouseLocation().y <= (this.y + getHeight())))
        {
            state.changeIsGameStarted(false);
            state.addGameObject(new StartMenu(state, x + 100, y + 100, height, width));
            state.removeGameObject(this);
        }
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, height, width);
        g.setColor(Color.WHITE);
        g.drawString("Redo", x + height / 2, y + width / 2);
    }

    /**
     * Returns the location of the object in Point form in the MainMenu class.
     */
    public Point getLocation()
    {
        return new Point(x, y);
    }

    public int getHeight()
    {
        return this.width;
    }

    public int getWidth()
    {
        return this.height;
    }

    public void setLocation(Point location)
    {
        
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }
}
