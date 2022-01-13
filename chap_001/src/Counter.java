import javax.swing.*;

public class Counter {
    private int balance;
    private final String name;
    private String[] array; //= {"Red", "Green", "Blue", "Purple", "Orange", "White", "Yellow"};

    public Counter(String name, int balance)
    {
        this.name = name;
        this.balance = balance;
        stringArrayInit();
    }

    public void setBalance(int value)
    {
        this.balance = value;
    }

    public int getBalance()
    {
        return balance;
    }

    public String getName()
    {
        return name;
    }

    public void increment(int value)
    {
        setBalance(getBalance() + value);
    }

    public void increment()
    {
        //balance = balance + 1;
        //setBalance(getBalance() + 1);
        this.increment(1);
    }

    public void decrement(int value)
    {
        setBalance(getBalance() - value);
    }

    public void decrement()
    {
        //balance--;
        //setBalance(getBalance() - 1);
        this.decrement(1);
    }

    public void reset()
    {
        balance = 0;
    }

    public void setArray(String[] arr)
    {
        array = arr;
    }

    public String[] getArray()
    {
        return array;
    }

    public int getArraySize()
    {
        return array.length;
    }




    public String toString()
    {
        return "\nCounter " + getName() + "\nBalance: " + getBalance() + "\nElement: " + getElementArray();
    }

    public void print()
    {
        System.out.println(this.toString());
    }

    public String arrayToString()
    {
        String string = "";
        for(int i = 0; i < getArraySize(); i++)
        {
            string += array[i] + " ";
        }
        return string;
    }

    public void printArray()
    {
        System.out.println("\nPrint Array: " + arrayToString());
    }

    public String getElementArray()
    {
        int order = getBalance();
        if(order < 0)
        {
            order = Math.abs(order);
        }
        order = order % getArraySize();
        return array[order];
    }

    public void stringArrayInit(){
        array = new String[getStringNumber()];
        for(int i = 0; i < array.length; i++)
        {
            array[i] = arrayElement(i);
        }
    }

    public int getStringNumber(){
        String number = JOptionPane.showInputDialog("Number of array elements: ");
        return Integer.parseInt(number);
    }

    public String arrayElement(int e){
        String string = JOptionPane.showInputDialog("Enter " + (e + 1) + " elements of array: ");
        return string;
    }
}
