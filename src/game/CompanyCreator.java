package game;

/**
 * This java class file is used to hold the class that stores the information about companies the player can invest
 * in, the successChance variable is the chance of success the company has, the amountRaised is the amount of money
 * the current company has already raised before the player, the amountReturned variable relies upon the
 * successChance variable and will be the amount of money the player gets back when they invest, this is determined
 * through a separate function much later, and the income and spending variables will help determine the
 * successChance variable
 */

public class CompanyCreator
{

    private int successChance;
    private int amountRaised;
    private int amountReturned;
    private int income;
    private int spending;
    private String name;

    public CompanyCreator()
    {
        setRandomValues();
    }

    public CompanyCreator(int successChance, int amountRaised, int amountReturned, int income, int spending, String name)
    {
        this.successChance = successChance;
        this.amountRaised = amountRaised;
        this.amountReturned = amountReturned;
        this.income = income;
        this.spending = spending;
        this.name = name;
    }

    public String generateRandomName()
    {
        String[] names = {"Apple", "Microsoft", "Google", "Amazon", "Facebook", "Netflix", "Tesla", "SpaceX", "Nvidia", "Intel", "IBM", "Oracle", "Microsoft", "Amazon", "Facebook", "Netflix", "Tesla", "SpaceX", "Nvidia", "Intel", "IBM", "Oracle"};
        int randomIndex = (int) (Math.random() * names.length);
        return names[randomIndex];
    }

    private int generateRandomInt(int min, int max)
    {
        return (int) (Math.random() * (max - min) + min);
    }

    public int getSuccessChance()
    {
        return successChance;
    }

    public int getAmountRaised()
    {
        return amountRaised;
    }

    public int getAmountReturned()
    {
        return amountReturned;
    }

    public int getIncome()
    {
        return income;
    }

    public int getSpending()
    {
        return spending;
    }

    public void setSuccessChance(int newSuccessChance)
    {
        successChance = newSuccessChance;
    }

    public void setAmountRaised(int newAmountRaised)
    {
        amountRaised = newAmountRaised;
    }

    public void setAmountReturned(int newAmountReturned)
    {
        amountReturned = newAmountReturned;
    }

    public void setIncome(int newIncome)
    {
        income = newIncome;
    }

    public void setSpending(int newSpending)
    {
        spending = newSpending;
    }

    public void generateRandomSuccessChance()
    {
        successChance = generateRandomInt(1, 100);
    }

    public void generateRandomAmountRaised()
    {
        amountRaised = generateRandomInt(1, 100);
    }

    public void generateRandomAmountReturned()
    {
        amountReturned = generateRandomInt(1, 100);
    }

    public void generateRandomIncome()
    {
        income = generateRandomInt(1, 100);
    }

    public void generateRandomSpending()
    {
        spending = generateRandomInt(1, 100);
    }

    public void setRandomValues()
    {
        generateRandomSuccessChance();
        generateRandomAmountRaised();
        generateRandomAmountReturned();
        generateRandomIncome();
        generateRandomName();
        generateRandomSpending();
    }

    public void printValues()
    {
    	System.out.println("Success Chance: " + successChance);
    	System.out.println("Amount Raised: " + amountRaised);
    	System.out.println("Amount Returned: " + amountReturned);
    	System.out.println("Income: " + income);
    	System.out.println("Spending: " + spending);
    }
}

