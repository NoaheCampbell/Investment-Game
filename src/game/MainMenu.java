package game;

import java.awt.*;

public class MainMenu extends Menu implements OnScreen
{
    private StringFormatting title;

    public MainMenu(GameState state, int x, int y, int height, int width)
    {
        super(state, x, y, height, width);
        title = new StringFormatting(x, y, width, height, "Redo");

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
            state.addGameObject(new StartMenu(state, x, y + 200, height, width));
            state.removeGameObject(this);
        }
    }

    public void draw(Graphics g)
    {
        title.changeOffset(title.getOffset(g));
        g.setColor(Color.BLACK);
        g.fillRect(x, y, width, height);
        g.setColor(Color.WHITE);
        g.drawString(title.getContents(), title.centerString().x, title.centerString().y);
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
        return this.height;
    }

    public int getWidth()
    {
        return this.width;
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
