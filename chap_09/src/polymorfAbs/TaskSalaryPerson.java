package polymorfAbs;

public class TaskSalaryPerson extends Person implements ISalary{
    private int noOfHours;
    private Crowns hourlyWage;
    private double bonusRate;
    public TaskSalaryPerson(String name, Sex sex, int hours, Crowns hourlyWage, double bonusRate){
        super(name, sex);
        noOfHours = hours;
        this.hourlyWage = hourlyWage;
        this.bonusRate = bonusRate;
    }

    public int getNoOfHours(){return noOfHours;}
    public Crowns getHourlyWage(){return hourlyWage;}
    public double getBonusRate(){return bonusRate;}

    public Crowns salaryCalculation(){
        Crowns salary = getHourlyWage().multiplication(getNoOfHours());
        Crowns bonus = salary.multiplication(getBonusRate());
        return salary.plus(bonus);
    }
    public String toString(){
        return super.toString() + " Salary: " + salaryCalculation().toString();
    }
    public void print(){
        System.out.println(toString());
    }
}
