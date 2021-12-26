package game;

import java.awt.Graphics;

public class CheckingAccount extends Account
{

    StringFormatting redo;
    StringFormatting title;

    public CheckingAccount(GameState state, double balance, double lastDeposit, double lastWithdrawal, 
                           double totalAmountDeposited, double totalAmountWithdrawn)
    {
        super(state, balance, lastDeposit, lastWithdrawal, totalAmountDeposited, totalAmountWithdrawn);
    }
    
    public void update() 
    {
        
    }

    public void draw(Graphics g)
    {
       
    }
    
}
