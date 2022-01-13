package record;

public class Person extends Record{
    private String name;
    private String sex;

    public Person(){
        super();
        name = "not given";
        sex = "not given";
    }
    public Person(int key,String name, String sex){
        super(key);
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %s %s",super.toString(),"name: ",getName(),"sex: ",getSex());
    }

    public void print() {System.out.println(this.getClass().getName() + " " + toString());}

}
