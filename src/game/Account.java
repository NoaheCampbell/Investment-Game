package game;

abstract public class Account implements OnScreen
{
    protected GameState state;
    protected double balance;
    protected double lastDeposit;
    protected double lastWithdrawal;
    protected double totalAmountDeposited;
    protected double totalAmountWithdrawn;

    public Account(GameState state, double balance, double lastDeposit, double lastWithdrawal, double totalAmountDeposited, double totalAmountWithdrawn)
    {
        this.state = state;
        this.balance = balance;
        this.lastDeposit = lastDeposit;
        this.lastWithdrawal = lastWithdrawal;
        this.totalAmountDeposited = totalAmountDeposited;
        this.totalAmountWithdrawn = totalAmountWithdrawn;
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
        balance = (double) Math.round(balance * 100) / 100;
        return balance;
    }

    /**
     * Changes the current balance to match the amount in the input
     * @param balance
     */
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

}

