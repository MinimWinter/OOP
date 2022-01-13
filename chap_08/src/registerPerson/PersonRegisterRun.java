package registerPerson;

public class PersonRegisterRun {
   public static void main(String args[]){
       Register r = new Register(3);
       Person ja = new Person("Maxim",2000, 51);
       r.insert(ja);
       Person anna = new Person("Anna", 2001, 50);
       r.insert(anna);
       Person mamka = new Person("Dita", 1975, 59);
       r.insert(mamka);
       r.print();

       r.youngestPerson();
       r.oldestPerson();

       r.remove(1);
       r.remove("Maxim");
       r.print();
   }
}
