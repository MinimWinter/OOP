package registr;

public class RegisterRun {
    public static void main(String args[])
    {
        Register a = new Register(8);
        a.insert(10);
        a.insert(5);
        a.insert(8);
        a.insert(6);
        a.insert(25);
        a.insert(11);
        a.insert(7);
        a.insert(13);
        a.insert(26);
        a.print();

        int number = a.find(8);
        System.out.println("Element 8 is placed on: " + number + ". place");
        a.remove(25);
        a.print();
        System.out.println("Minimal element in register: " + a.minimum());
        int b = a.getElement(2);
        System.out.println("Index 2 contains: " + b);

        System.out.println("Modified register");
        Register d = a.adjustedRegister(12, 15);
        d.print();
    }
}
