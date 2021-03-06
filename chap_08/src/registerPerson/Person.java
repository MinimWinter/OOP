package registerPerson;

import java.util.Calendar;
public class Person {
    private String name;
    private int yearOfBirth;
    private int weight;
    public Person()
    {   name = "Not given";
        yearOfBirth = 0;
        weight = 0;
    }
    public Person(String name, int yearOfBirth, int weight)
    { this.name= name; this.yearOfBirth = yearOfBirth;
        this.weight = weight;
    }
    public void setName(String name)
    { this.name = name; }

    public String getName() {
        return name;
    }
    public void setYearOfBirth(int yearOfBirth)
    { this.yearOfBirth = yearOfBirth; }

    public int getYearOfBirth()
    { return yearOfBirth; }

    public int getAge(){
        Calendar calendar = Calendar.getInstance();
        return calendar.get(1) - getYearOfBirth();
    }


    public void setWeight(int weight)
    { this.weight = weight; }

    public int getWeight()
    { return weight; }

    public String toString()
    {
        return String.format("%5s %s %15s %4d %5s %d\n", "Name: ",getName(),"year of birth:", getYearOfBirth(),
            "weight:", getWeight());
    }

    public void print()
    { System.out.println(this.toString()); }
}
