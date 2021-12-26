package game;

import java.awt.*;

/**
 * This is a child class, derived from the Account class. The purpose of this is to provide a way to store the investor's
 * account information, and to give an easy way for the user to store, earn, and spend money in an investor's account.
 */

public class InvestorAccount extends Account
{
    private double balance;
    private double interestRate;
    private double interest;
    private double interestEarned;

    public InvestorAccount(GameState state, double balance, double interestRate, double interest, 
                           double interestEarned, double lastDeposit, double lastWithdrawal, double totalAmountDeposited,
                           double totalAmountWithdrawn)
    {
        super(state, balance, lastDeposit, lastWithdrawal, totalAmountDeposited, totalAmountWithdrawn);
    }

    /**
     * Returns the interest rate on the player's Investment account
     * @return interestRate
     */
    public double getInterestRate()
    {
        return interestRate;
    }

    /**
     * Returns the amount of money that the player gained through interest
     * @return interestEarned
     */
    public double getInterestEarned()
    {
        return interestEarned;
    }

    /**
     * Sets the interest rate of the Investor's account to be whatever the input is
     * @param interestRate
     */
    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    /**
     * Adds the most recent earned in interest to the interest earned field
     * @param interestEarned
     */
    public void addInterestEarned(double interestEarned)
    {
        this.interestEarned += interestEarned;
    }

    /**
     * This method is used to draw the investor's account information on the screen.
     */
    public void print()
    {
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Interest: " + interest);
        System.out.println("Interest Earned: " + interestEarned);
    }

    public void update()
    {

    }

    public void draw(Graphics g)
    {

    }
}
