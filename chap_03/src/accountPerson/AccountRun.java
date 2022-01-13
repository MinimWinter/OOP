package accountPerson;

public class AccountRun {
    public static void main(String[] agr)
    {
        Account account123 = new Account(123, new Crowns(200), AccountType.CURRENT);

        account123.print();
        account123.setAccountType(AccountType.SPECIAL);
        account123.deposit(new Crowns(35.56));
        account123.print();

        Crowns crowns = new Crowns(893.76);
        Crowns crownA = account123.withdraw(crowns);
        System.out.println("Remaining crowns: " + crownA.toString());
        account123.print();


    }
}
