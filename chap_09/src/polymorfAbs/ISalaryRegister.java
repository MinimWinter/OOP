package polymorfAbs;

public class ISalaryRegister {
    private ISalary array[];
    private int top;

    public ISalaryRegister(int number){
        top = -1;
        array = new ISalary[number];
    }

    public int getTop(){ return top; }

    public void insert(ISalary iSalary){
        if((top+1) < array.length)
        {
            top += 1; array[getTop()] = iSalary;
        }
        else System.out.println("Register is full");
    }

    public ISalary getElement(int i){
        ISalary iSalary = null;
        if(i>=0 && i < array.length){
            iSalary = array[i];
        }
        else System.out.printf("%s %d %s\n","Index",i,"is out of range");
        return iSalary;
    }
}
