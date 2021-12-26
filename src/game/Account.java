package game;

abstract public class Account implements OnScreen
{
    protected double balance;
    protected double lastDeposit;
    protected double lastWithdrawal;
    protected double totalAmountDeposited;
    protected double totalAmountWithdrawn;

    public Account()
    {

    }

    public double getBalance()
    {
        return balance;
    }

    public double getLastDeposit()
    {
        return lastDeposit;
    }

    public double getLastWithdrawal()
    {
        return lastWithdrawal;
    }

    public double getTotalAmountDeposited()
    {
        return totalAmountDeposited;
    }

    public double getTotalAmountWithdrawn()
    {
        return totalAmountWithdrawn;
    }

    public void deposit(double amount)
    {
        balance += amount;
        lastDeposit = amount;
        totalAmountDeposited += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
        lastWithdrawal = amount;
        totalAmountWithdrawn += amount;
    }

    public void transfer(Account destination, double amount)
    {
        balance -= amount;
        destination.balance += amount;
    }

}

