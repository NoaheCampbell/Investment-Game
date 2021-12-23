package game;

import java.awt.Point;

abstract public class Menu
{
protected GameState state;
protected int x, y;
protected int height, width;

public Menu(GameState state, int x, int y, int height, int width)
{
    this.state = state;
    this.x = x;
    this.y = y;
    this.height = height;
    this.width = width;
}

    abstract public Point getLocation();

    abstract public int getHeight();

    abstract public int getWidth();

    abstract public void setLocation(Point location);

    abstract public int getX();

    abstract public int getY();
}
