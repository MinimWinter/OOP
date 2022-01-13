package registr;

public class Register {
    private int array[];
    private int top;

    public Register(int number){
        array = new int[number];
        top = -1;
    }

    public int getTop(){
        return top;
    }

    public void insert(int element){
        if((top + 1) < array.length)
        {
            top += 1; array[getTop()] = element;
        }
        else System.out.println("Register is full");
    }

    public String toString(){
        String t = String.format("%5s %9s\n","Index","Value");
        for(int i = 0; i<=top; ++i)
        {
            t = t+ String.format("%5d %9d\n", i, array[i]);
        }
        return t;
    }

    public void print(){
        System.out.println(this.toString());
    }

    public int getElement(int i)
    {
        int element = 0;
        if(i >= 0 && i <= top)
        {
            element = array[i];
        }
        else System.out.printf("%s %d %s\n","Index ",i , " is out of range");
        return element;
    }

    public int find(int element){
        int vysl = -1;
        for(int i = 0; i <= top; i++)
        {
            if(array[i] == element)
            {
                vysl = i; break;
            }
        }
        return vysl;
    }

    public void remove(int element){
        int result = find(element);
        if(result > -1){
            for(int i = result; i < getTop(); i++){
                array[i] = array[i+1];
            }
            top -= 1;
            System.out.println("Element was removed");
        }else System.out.printf("%s %d %s\n","Element", element, "is not in the register");
    }

    public int minimum(){
        int min = getElement(0);
        for(int i = 1; i<=getTop(); i++) {
            if (getElement(i) < min) min = getElement(i);
        }
        return min;
    }

    public Register adjustedRegister(int limitMin, int limitMax){
        Register newReg = new Register(array.length);
        for(int i = 0; i <= getTop(); i++)
        {
            if(getElement(i) >= limitMin && getElement(i) <= limitMax)
            {
                newReg.insert(getElement(i));
            }
        }
        return newReg;
    }

    public void removeAll()
    {
        top = -1;
    }

}
