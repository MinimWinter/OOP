package singleton;

public final class Account {
    private int number;
    private Crowns balance;
    private AccountType type;
    private static Account singleton;

    private Account(int number, Crowns balance, AccountType type)
    {
        this.number = number;
        this.balance = balance;
        this.type = type;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public Crowns getBalance()
    {
        return balance;
    }

    public void setBalance(Crowns nBalance)
    {
        this.balance = nBalance;
    }

    public AccountType getAccountType(){
        return type;
    }

    public void setAccountType(AccountType type)
    {
        this.type = type;
    }

    public static Account getInstance(){
        if(singleton == null)
        {
            singleton = new Account(123, new Crowns(200), AccountType.SPECIAL);
        }
        return singleton;
    }

    public void deposit(double amount)
    {
        this.deposit(new Crowns(amount));
    }

    public void deposit(Crowns amount)
    {
        this.balance = balance.plus(amount);
    }

    public Crowns withdraw(double amount)
    {
        return this.withdraw(new Crowns(amount));
    }

    public Crowns withdraw(Crowns amount)
    {
        balance = balance.minus(amount);
        return  getBalance();
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("");
       // sb.append(getClass().getName() + "\n");
        sb.append("\n");
        sb.append("Account number: ");
        sb.append(getNumber());
        sb.append(", Account type: ");
        sb.append(getAccountType());
        sb.append(", Balance: ");
        sb.append(getBalance().toString() + "\n");
        return sb.toString();
    }

    public void print()
    {
        System.out.println(toString());
    }
}
