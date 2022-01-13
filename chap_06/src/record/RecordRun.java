package record;

import java.util.ArrayList;

public class RecordRun {
    public static void main(String[] args) {
        Record record = new Record(1);
        record.print();

        Book book = new Book(7, "Follet","Pilire Zeme");
        book.print();

        Person person = new Person(13,"Jan","male");
        person.print();

        Employee employee = new Employee(22,"Eva", "female","manager",new Crowns(45000));
        employee.print();

        Student student = new Student(15,"Ivan","male","chemistry");
        student.print();


        Record recordX;
        recordX = book;
        System.out.println("Polymorphism");
        recordX.print();
        int number = recordX.getKey();
        //String author = recordX.getAuthor();

        Book bookX = (Book) recordX;
        String author = bookX.getAuthor();
        Person personX;
        personX = student;
        //personX = record;
        personX.getName();
        personX.print();

        Record[] recordArray = new Record[5];
        recordArray[0] = record;
        recordArray[1] = new Student(33,"Emil", "male","Chemistry");
        recordArray[2] = person;
        recordArray[3] = book;
        recordArray[4] = new Employee(44,"Rosta", "male", "Accountant", new Crowns(29000));
        System.out.println("record array print: \n");
        for(int i = 0; i < recordArray.length;i++){
            recordArray[i].print();
        }


        Person[] personArray = new Person[4];
        personArray[0] = person;
        personArray[1] = employee;
        personArray[2] = new Student(67, "Pavel", "male","geography");
        personArray[3] = person;
        for(int i = 0 ; i < personArray.length ; i++)
            personArray[i].print();

        ArrayList<Record> recordList = new ArrayList<Record>();
        recordList.add(record);
        recordList.add(new Student(33, "Maxim", "male","IT"));
        recordList.add(person);
        recordList.add(book);
        System.out.println("\nRecordList print");
        for(int i = 0; i < recordList.size(); i++)
        {
            recordList.get(i).print();
        }



    }


}
