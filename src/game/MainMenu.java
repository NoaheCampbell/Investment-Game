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
            state.addGameObject(new StartMenu(state, x, y, height, width));
            state.removeGameObject(this);
        }
    }

    public void draw(Graphics g)
    {
        drawTitle(g, 200, 0, "Main Menu", Color.BLACK);
        drawShape(g, "rectangle", x, y, width, height, Color.BLACK);
        drawTitle(g, x, y, "Redo", Color.WHITE);
    }

    /**
     * Creates a String and draws it to the screen based off of the parameters.
     * 
     * @param Graphics g
     * @param int x
     * @param int y
     * @param String contents
     * @param Color color
     */
    public void drawTitle(Graphics g, int x, int y, String contents, Color color)
    {
        StringFormatting title = new StringFormatting(x, y, width, height, contents);
        g.setColor(color);
        g.drawString(contents, title.centerStringInObject(g).x, title.centerStringInObject(g).y);
    }

    /**
     * Draws a shape to the screen based off of the parameters.
     * 
     * @param Graphics g
     * @param String shape
     * @param int x
     * @param int y
     * @param int width
     * @param int height
     * @param Color color
     */
    public void drawShape(Graphics g, String shape, int x, int y, int width, int height, Color color)
    {
        g.setColor(color);
        if(shape.equals("rectangle"))
        {
            g.fillRect(x, y, width, height);
        }
        else if(shape.equals("circle"))
        {
            g.fillOval(x, y, width, height);
        }
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
