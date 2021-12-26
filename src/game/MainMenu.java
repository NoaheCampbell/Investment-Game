package game;
import java.awt.*;
public class MainMenu extends Menu implements OnScreen
{

    private StringFormatting redo;
    private InvestorAccount investorAccount;
    private CheckingAccount checkingAccount;
    private SavingsAccount savingsAccount;

    public MainMenu(GameState state, int x, int y, int height, int width)
    {
        super(state, x, y, height, width);
        investorAccount = state.getInvestorAccount();
        checkingAccount = state.getCheckingAccount();
        savingsAccount = state.getSavingsAccount();
    }

    public void update()
    {
        // Checks to see if the user clicked on the screen at a specific location, and if they did, it removes
        // that object that was clicked on, and then adds the specific menu to the screen.
        
        if(state.isMouseClicked())
        {
            // Checks tp see if the redo button was clicked.
            if((state.getMouseLocation().x >= redo.getX() && state.getMouseLocation().y >= redo.getY()) &&
              (state.getMouseLocation().x <= (redo.getX() + redo.getWidth()) && 
              state.getMouseLocation().y <= (redo.getY() + redo.getHeight())))
            {
            state.changeIsGameStarted(false);
            state.addGameObject(new StartMenu(state, 200, 250, height, width));
            state.removeGameObject(this);
            }
            // Checks to see if the balance button was clicked.
            else if((state.getMouseLocation().x >= 175 && state.getMouseLocation().y >= 150) && 
                   (state.getMouseLocation().x <= 275 && state.getMouseLocation().y <= 200))
            {
                // Adds the balance menu to the game state.
                state.addGameObject(new BalanceMenu(state, 200, 0, height, width, investorAccount, checkingAccount, savingsAccount));
                state.removeGameObject(this);
            }
            // Checks to see if the deposit button was clicked.
            else if((state.getMouseLocation().x >= 175 && state.getMouseLocation().y >= 250) && 
                   (state.getMouseLocation().x <= 275 && state.getMouseLocation().y <= 300))
            {
                // Adds the deposit menu to the game state.
                
                state.addGameObject(new StartMenu(state, x, y, height, width));
                state.removeGameObject(this);
            }
            //Checks to see if the withdraw button was clicked.
            else if((state.getMouseLocation().x >= 325 && state.getMouseLocation().y >= 150) && 
                   (state.getMouseLocation().x <= 425 && state.getMouseLocation().y <= 200))
            {
                // Adds the withdraw menu to the game state.
                state.addGameObject(new StartMenu(state, x, y, height, width));
                state.removeGameObject(this);
            }
            //Checks to see if the invest button was clicked
            else if((state.getMouseLocation().x >= 325 && state.getMouseLocation().y >= 250) && 
                   (state.getMouseLocation().x <= 425 && state.getMouseLocation().y <= 300))
            {
                // Adds the invest menu to the game state.
                state.addGameObject(new StartMenu(state, x, y, height, width));
                state.removeGameObject(this);
            }
        }
    }
    public void draw(Graphics g)
    {
        //Draws redo button
        redo = new StringFormatting(300, 500, 50, 25, "Go Back");
        g.setColor(Color.BLACK);
        g.fillRect(redo.getX(), redo.getY(), redo.getWidth(), redo.getHeight());
        g.setColor(Color.WHITE);
        g.drawString(redo.getContents(), redo.centerStringInObject(g).x, redo.centerStringInObject(g).y);

        //Draws the Menu title.
        drawTitle(g, 200, 0, "Main Menu", Color.BLACK);

        //Draws the Menu options.
        drawShape(g, "rectangle", 175, 150, 100, 50, Color.BLACK);
        drawTitle(g, 125, 130, "Balance", Color.WHITE);

        drawShape(g, "rectangle", 175, 250, 100, 50, Color.BLACK);
        drawTitle(g, 125, 230, "Deposit", Color.WHITE);

        drawShape(g, "rectangle", 325, 150, 100, 50, Color.BLACK);
        drawTitle(g, 275, 130, "Withdraw", Color.WHITE);

        drawShape(g, "rectangle", 325, 250, 100, 50, Color.BLACK);
        drawTitle(g, 275, 230, "Invest", Color.WHITE);

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