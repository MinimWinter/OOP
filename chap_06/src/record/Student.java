package record;

public class Student extends Person {
    private String brachnOfStudy;

    public Student(){
        super(); brachnOfStudy = "NOT GIVEN";
    }
    public Student(int key,String name, String sex, String branch){
        super(key,name,sex); this.brachnOfStudy = branch;
    }
    public String toString() {
        return String.format("%s %s %s \n", super.toString(), "branch of study: ", getBrachnOfStudy());
    }

    public String getBrachnOfStudy(){
        return brachnOfStudy;
    }
}
