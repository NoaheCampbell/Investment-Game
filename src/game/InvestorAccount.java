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

    public InvestorAccount(double balance, double interestRate)
    {
        super();
        this.balance = balance;
        this.interestRate = interestRate;
    }

    /**
     * This method adds the amount specified in the parameter to the balance of the investor's account.
     * @param amount
     */
    public void deposit(double amount)
    {
        balance += amount;
    }

    /**
     * This method is used to take the amount specified in the parameter and subtract it from
     * the balance of the investor's
     * @param amount
     */
    public void withdraw(double amount)
    {
        balance -= amount;
    }

    /**
     * Returns the player's balance
     * @return balance
     */
    public double getBalance()
    {
        return balance;
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
     * Changes the current balance to match the amount in the input
     * @param balance
     */
    public void setBalance(double balance)
    {
        this.balance = balance;
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
