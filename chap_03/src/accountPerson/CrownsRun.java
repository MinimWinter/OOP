package accountPerson;

public class CrownsRun {
    public static void main(String[] args) {
        Crowns crownA = new Crowns(-0.05);
        crownA.print();
        Crowns crownB = new Crowns(23.10);
        crownB.print();
        Crowns crownC = new Crowns(-69.87);
        crownC.print();

        Crowns crownS = crownB.plus(crownC);
        crownS.print();

        Crowns crownR = crownS.minus(crownB);
        crownR.print();
    }
}
