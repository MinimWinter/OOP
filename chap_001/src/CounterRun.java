public class CounterRun {

    public static void main(String[] args) {
        Counter counter = new Counter("Maxim",5);
        Counter counter2 = new Counter("Anna", -22);

        System.out.println("Origin counter\n*****************");
        counter.print();
        counter2.print();
        for(int i = 0; i < 5; i++)
        {
            counter.increment();
            counter2.increment();
        }
        System.out.println("\nAfter increment\n*****************");
        counter.print();
        counter2.print();
        for(int j = 0; j < 2; j++)
        {
            counter.decrement();
            counter2.decrement();
        }
        System.out.println("\nAfter decrement\n*****************");
        counter.print();
        counter2.print();
        counter.printArray();

        String[] arrayA = counter.getArray();
        System.out.println("\nPrint the original array: ");
        for(int i = 0; i < arrayA.length; i++)
        {
            System.out.println(arrayA[i]);
        }
        //new array
        String[] arrayNew = {"Ostrava", "Praha", "London"};
        counter.setArray(arrayNew);
        System.out.println("\nARRAY UPDATED");
        counter.print();
        counter.printArray();
    }
}
