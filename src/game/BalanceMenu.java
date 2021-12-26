package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class BalanceMenu extends Menu implements OnScreen
{
    private StringFormatting title;
    private InvestorAccount investorAccount;
    private StringFormatting redo;

    public BalanceMenu(GameState state, int x, int y, int height, int width, InvestorAccount investorAccount)
    {
        super(state, x, y, height, width);
        this.investorAccount = investorAccount;
    }

    public void update() 
    {

        // Checks to see if the redo button was clicked, and if it was, goes back to the Main Menu
        if(state.isMouseClicked())
        {
            if((state.getMouseLocation().x >= redo.getX() && state.getMouseLocation().y >= redo.getY()) &&
              (state.getMouseLocation().x <= (redo.getX() + redo.getWidth()) && 
              state.getMouseLocation().y <= (redo.getY() + redo.getHeight())))
            {
                state.addGameObject(new MainMenu(state, x, y, height, width));
                state.removeGameObject(this);
            }
        }

    }

    public void draw(Graphics g)
    {
        title = new StringFormatting(x, y, 100, 50, null);

        // Draws the main title for the scene.
        drawTitle(g, x, y, "Balance Options", Color.BLACK);

        // Draws the options for the user to choose from.
        title.setContents("Investor Account Balance: " + investorAccount.getBalance());
        title.setLocation(110, 125);
        drawShape(g, "rectangle", 25, 160, width + 50, height - 20, Color.BLACK);
        drawTitle(g, title.centerStringInObject(g).x - 10, title.centerStringInObject(g).y, title.getContents(), Color.WHITE);

        redo = new StringFormatting(300, 500, 50, 25, "Go Back");
        g.setColor(Color.BLACK);
        g.fillRect(redo.getX(), redo.getY(), redo.getWidth(), redo.getHeight());
        g.setColor(Color.WHITE);
        g.drawString(redo.getContents(), redo.centerStringInObject(g).x, redo.centerStringInObject(g).y);
    }

    public Point getLocation()
    {
        return new Point(x, y);
    }

    public int getHeight() 
    {
        return height;
    }

    public int getWidth() 
    {
        return width;
    }

    public void setLocation(Point location)
    {
        this.x = location.x;
        this.y = location.y;
    }

    public int getX() 
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
    
}
