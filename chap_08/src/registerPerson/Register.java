package registerPerson;

public class Register {
    private Person array[];
    private int top;

    public Register(int number){
        array = new Person[number];
        top = -1;
    }

    public int getTop(){
        return top;
    }

    public void insert(Person element){
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
            t = t+ String.format(i +"         " + array[i].toString());
        }
        return t;
    }

    public void print(){
        System.out.println(this.toString());
    }

    public Person getElement(int i)
    {
        Person element = new Person();
        if(i >= 0 && i <= top)
        {
            element = array[i];
        }
        else System.out.printf("%s %d %s\n","Index ",i , " is out of range");
        return element;
    }

    public Person find(Person element){
        Person vysl = new Person();
        for(int i = 0; i <= top; i++)
        {
            if(array[i] == element)
            {
                vysl = array[i]; break;
            }
        }
        return vysl;
    }

    public int find(String name)
    {
        int result = -1;
        for(int i = 0; i <= getTop(); i++){
            if(array[i].getName().equals(name)){
                result = i; break;
            }
        }
        return result;
    }

    public void remove(String name){
        int index = find(name);
        if(index == -1) System.out.printf("%s %s %s","Name:",name,"is not in the register");
        else this.remove(index);
    }

    public void remove(int index){
        for(int i = 0; i < top - index; i++){
            array[index+i] = array[index+i+1];
            top -= 1;
            System.out.println("Element was removed");
        }
    }

   /* public Register adjustedRegister(int limitMin, int limitMax){
        Register newReg = new Register(array.length);
        for(int i = 0; i <= getTop(); i++)
        {
            if(getElement(i) >= limitMin && getElement(i) <= limitMax)
            {
                newReg.insert(getElement(i));
            }
        }
        return newReg;
    }*/

    public void removeAll()
    {
        top = -1;
    }

    public void youngestPerson()
    {
        Person vysl = array[0];
        for(int i = 0; i < getTop(); i++){
            if(array[i].getAge() < vysl.getAge()){
                vysl = array[i];
            }
        }
        System.out.println("The Youngest person is: " + vysl.toString() + "Age: " + vysl.getAge());
    }

    public void oldestPerson()
    {
        Person vysl = array[0];
        for(int i = 0; i < getTop() + 1; i++){
            if(vysl.getAge() < array[i].getAge()){
                vysl = array[i];
            }
        }
        System.out.println("The oldest person is: " + vysl.toString() + "Age: " + vysl.getAge());
    }

}
