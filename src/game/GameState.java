package game;

import java.awt.*;
import java.util.ArrayList;

public class GameState
{
    private ArrayList<OnScreen> gameObjects;
    private ArrayList<OnScreen> objectsToAdd;
    private ArrayList<OnScreen> objectsToRemove;
    private int mouseX;
    private int mouseY;
    private boolean mouseClicked;
    private boolean gameStarted;
    private boolean gameOver;
    private InvestorAccount investorAccount;

    public GameState()
    {
        gameObjects = new ArrayList<>();
        objectsToAdd = new ArrayList<>();
        objectsToRemove = new ArrayList<>();
        mouseClicked = false;
        gameStarted = false;
        gameOver = false;
        investorAccount = null;
    }

    /**
     * Calls the draw method for each object inside the gameObjects ArrayList
     *
     * @param g
     */
    public void drawAll(Graphics g)
    {
        for(OnScreen object : gameObjects)
        {
            object.draw(g);
        }
    }

    /**
     * Calls the update method for each object inside the gameObjects ArrayList, then adds and removes
     * all necessary, or unnecessary, objects from the list
     */
    public void updateAll()
    {
        for(OnScreen object : gameObjects)
        {
            object.update();
        }
        gameObjects.addAll(objectsToAdd);
        objectsToAdd.clear();

        gameObjects.removeAll(objectsToRemove);
        objectsToRemove.clear();
    }

    /**
     * Adds an OnScreen object to the ArrayList, so it can be added to the game after the next update
     * @param object
     */
    public void addGameObject(OnScreen object)
    {
        objectsToAdd.add(object);
    }

    /**
     * Adds an OnScreen object to the ArrayList, so it can be removed from the game after the next update
     * @param object
     */
    public void removeGameObject(OnScreen object)
    {
        objectsToRemove.add(object);
    }

    /**
     * Returns the current location of the mouse in the form of a Point object
     * @return mouseLocation
     */
    public Point getMouseLocation()
    {
        return new Point(mouseX, mouseY);
    }

    /**
     * Updates the current mouseX and mouseY based on the input
     * @param mouseX
     * @param mouseY
     */
   public void setMouseLocation(int mouseX, int mouseY)
   {
       this.mouseX = mouseX;
       this.mouseY = mouseY;
   }

    /**
     * Returns true if the mouse is currently clicked, and false otherwise
     * @return mouseClicked
     */
   public boolean isMouseClicked()
   {
       return mouseClicked;
   }

    /**
     * Changes the clicked status of the mouse based off of input
     * @param newMouseClicked
     */
   public void changeIsMouseClicked(boolean newMouseClicked)
   {
       mouseClicked = newMouseClicked;
   }

    /**
     * Returns whether the game has started or not
     * @return gameStarted
     */
   public boolean isGameStarted()
   {
       return gameStarted;
   }

    /**
     * Changes the status of the game starting or not based on input
     * @param newGameStarted
     */
   public void changeIsGameStarted(boolean newGameStarted)
   {
       gameStarted = newGameStarted;
   }

    /**
     * Returns if the game is over or not
     * @return
     */
   public boolean isGameOver()
   {
       return gameOver;
   }

    /**
     * Changes the status of the game over based on input
     * @param newGameOver
     */
   public void changeIsGameOver(boolean newGameOver)
   {
       gameOver = newGameOver;
   }

   public void setInvestorAccount(InvestorAccount investorAccount)
   {
       this.investorAccount = investorAccount;
   }

   public InvestorAccount getInvestorAccount()
   {
       return investorAccount;
   }
}
