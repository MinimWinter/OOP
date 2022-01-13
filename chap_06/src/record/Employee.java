package record;

public class Employee extends Person{
    private String position;
    private Crowns salary;

    Employee(){
        super();
        position = "NOT GIVEN";
        salary = null;
    }
    Employee(int key,String name,String sex, String position, Crowns salary){
        super(key, name, sex);
        this.position = position;
        this.salary = salary;
    }

    public String toString(){
        return String.format("%s %s: %s %s: %s \n",super.toString(),"position: ",getPosition(),"Salary: ", getSalary());
    }

    public Crowns getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }
}
