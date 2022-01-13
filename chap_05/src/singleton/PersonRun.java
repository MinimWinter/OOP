package singleton;

public class PersonRun {
    public static void main(String[] agr)
    {

        Person p1 = new Person("Maxim", 2000);
        Person p2 = new Person("Anna", 2001);
        PersonNext p3 = new PersonNext("Olivia", 2016);

        p1.print();
        p1.deposit(new Crowns(1500.50));
        p1.print();
        p2.withdraw(new Crowns(1000.25));
        p2.print();
        p3.changeAccountType(AccountType.SAVING);
        p3.deposit(new Crowns(15000));
        p3.print();

        Crowns crown = p1.withdraw(2250.50);
        crown.print();
        p2.print();

    }
}
