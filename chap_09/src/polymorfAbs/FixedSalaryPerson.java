package polymorfAbs;

public class FixedSalaryPerson extends Person implements ISalary{
    private Crowns fixedAmount;
    private Crowns bonus;

    public FixedSalaryPerson(String name, Sex sex, Crowns fixedAmount, Crowns bonus)
    {
        super(name, sex);
        this.fixedAmount = fixedAmount;
        this.bonus = bonus;
    }

    public Crowns getFixedAmount(){
        return fixedAmount;
    }

    public Crowns getBonus(){return bonus;}

    public Crowns salaryCalculation(){
        return getFixedAmount().plus(getBonus());
    }
    public String toString(){
        return super.toString() + " Salary: " + salaryCalculation().toString();
    }

    public void print(){
        System.out.println(toString());
    }
}
