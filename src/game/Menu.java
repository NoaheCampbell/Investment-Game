package game;

import java.awt.Point;
import java.awt.Graphics;
import java.awt.Color;

abstract public class Menu
{
protected GameState state;
protected int x, y;
protected int height, width;
protected StringFormatting redo;

public Menu(GameState state, int x, int y, int height, int width)
{
    this.state = state;
    this.x = x;
    this.y = y;
    this.height = height;
    this.width = width;
    this.redo = new StringFormatting(275, 500, 70, 25, "Go Back");
}

    abstract public Point getLocation();

    abstract public int getHeight();

    abstract public int getWidth();

    abstract public void setLocation(Point location);

    abstract public int getX();

    abstract public int getY();

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

    public void drawRedoButton(Graphics g)
    {
        drawShape(g, "rectangle", redo.getX(), redo.getY(), redo.getWidth(), redo.getHeight(), Color.BLACK);
        drawTitle(g, redo.centerStringInObject(g).x - 78, redo.centerStringInObject(g).y - 45, redo.getContents(), Color.WHITE);
        
    }
}
