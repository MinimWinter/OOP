package singleton;

import java.util.Calendar;

public class PersonNext {
    private String name;
    private int yearOfBirth;
   // private Account myAccount = Account.getInstance();

    public PersonNext(String name, int yearOfBirth)
    {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setYearOfBirth(int yearOfBirth)
    {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth()
    {
        return yearOfBirth;
    }

    public int getAge()
    {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(1);
        return currentYear - getYearOfBirth();
    }

   /* public void setMyAccount(Account myAccount)
    {
        this.myAccount = myAccount;
    }*/

    public Account getMyAccount()
    {
        return Account.getInstance();
    }

    public void deposit(int amount)
    {
        this.getMyAccount().deposit(amount);
    }

    public void deposit(Crowns crowns)
    {
        this.getMyAccount().deposit(crowns);
    }

    public void deposit(double amount)
    {
        Account.getInstance().deposit(amount);
    }

    public Crowns withdraw(Crowns crowns){
        return Account.getInstance().withdraw(crowns);
    }

    public Crowns withdraw(double amount)
    {
        return Account.getInstance().withdraw(amount);
    }

  /*  public int withdraw(int amount)
    {
        return getMyAccount().withdraw(amount);
    }*/

    public void changeAccountType(AccountType accountType){
        getMyAccount().setAccountType(accountType);
    }

    public String toString()
    {
        return "Name: " + getName() + ", Age: " + getAge() + " " + Account.getInstance().toString();
    }

    public void print()
    {
        System.out.println(this.toString());
    }
}
