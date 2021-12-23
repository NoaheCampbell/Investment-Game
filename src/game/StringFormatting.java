package game;

import java.awt.Point;
import java.awt.Graphics;

public class StringFormatting
{
    private int x, y, width, height, offset;
    private String contents;


    public StringFormatting(int x, int y, int width, int height, String contents)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.contents = contents;
        this.offset = 0;
    }

    /**
     * Returns the x coordinate of the String object.
     * @return int x
     */
    public int getX()
    {
        return x;
    }

    /**
     * Returns the y coordinate of the String object.
     * @return int y
     */
    public int getY()
    {
        return y;
    }

    /**
     * Returns the contents of the String object.
     * @return String contents
     */
    public String getContents()
    {
        return contents;
    }


    /**
     * Sets the x coordinate of the String object.
     * @param int x
     */
    public void setX(int x)
    {
        this.x = x;
    }

    /**
     * Sets the y coordinate of the String object.
     * @param int y
     */
    public void setY(int y)
    {
        this.y = y;
    }

    /**
     * Sets the contents of the String object.
     * @param String contents
     */
    public void setContents(String contents)
    {
        this.contents = contents;
    }

    /**
     * Sets the x and y location of the String object to be in the center of the object.
     */
    public Point centerString()
    {
        return new Point(x + (width / 2) - offset, (y + height / 2));
    }

    /**
     * Returns the width of the String object.
     * @return int width
     */
    public int getWidth()
    {
        return width;
    }


    /**
     * Returns the height of the String object.
     * @return int height
     */
    public int getHeight()
    {
        return height;
    }

    /**
     * Changes the offset for the String object.
     * @param newOffset
     */
    public void changeOffset(int newOffset)
    {
        offset = newOffset;
    }

    /**
     * Returns the offset for the String object.
     * @return int offset
     */
    public int getOffset(Graphics g)
    {
        return g.getFontMetrics().stringWidth(contents) / 2;
    }

}
