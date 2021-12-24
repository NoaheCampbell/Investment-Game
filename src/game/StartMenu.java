package game;

import java.awt.*;

public class StartMenu extends Menu implements OnScreen
{
    private StringFormatting title;

    public StartMenu(GameState state, int x, int y, int height, int width)
    {
        super(state, x, y, height, width);
        title = new StringFormatting(x, y, width, height, "Proceed");

    }


    public void update()
    {
        // Checks to see if the user clicked on the screen at a specific location, and if they did, it removes
        // that object that was clicked on, and then adds the main menu for the player to choose from.
        if(!state.isGameStarted() && state.isMouseClicked() &&
                (state.getMouseLocation().x >= this.x && state.getMouseLocation().y >= this.y) &&
                (state.getMouseLocation().x <= (this.x + getWidth()) && state.getMouseLocation().y <= (this.y + getHeight())))
        {
            state.changeIsGameStarted(true);
            state.addGameObject(new MainMenu(state, x, y, height, width));
            state.removeGameObject(this);
        }
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, width, height);
        g.setColor(Color.WHITE);
        g.drawString(title.getContents(), title.centerStringInObject(g).x, title.centerStringInObject(g).y);
    }

    /**
     * Returns the width of object in the StartMenu class.
     * @return int width
     */
    public int getWidth()
    {
        return width;
    }

    /**
     * Returns the height of object in the StartMenu class.
     * @return int height
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * Returns the location of the object in Point form in the StartMenu class.
     * @return Point
     */
    public Point getLocation()
    {
        return new Point(x, y);
    }

    /**
     * Sets the location of the object in the StartMenu class.
     * @param Point location
     */
    public void setLocation(Point location)
     {
        this.x = location.x;
        this.y = location.y;
        
        }

    /**
     * Returns the x coordinate of the object in the StartMenu class.
     * @return int x
     **/
    public int getX()
     {
        return x;
    }

    /**
     * Returns the y coordinate of the object in the StartMenu class.
     * @return int y
     */
    public int getY()
     {
        return y;
    }
}
