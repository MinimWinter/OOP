package accountPerson;

public class PersonRun {
    public static void main(String[] agr)
    {
        Account a1 = new Account(2310, new Crowns(4000), AccountType.CURRENT);
        Person p1 = new Person("Maxim", 2000, a1);

        p1.print();
        p1.deposit(new Crowns(1500.50));
        p1.print();
        p1.withdraw(new Crowns(1000.25));
        p1.print();
        p1.changeAccountType(AccountType.SAVING);
        p1.deposit(new Crowns(15000));
        p1.print();

        Crowns crown = p1.withdraw(2250.50);
        crown.print();
        p1.print();

    }
}
