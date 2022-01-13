package record;

public class Book extends Record{
    private String author;
    private String title;

    Book(){
        super();
        author = "NOT GIVEN"; title = "NOT GIVEN";
    }
    Book(int klic, String author, String title){
        super(klic);
        this.author = author;
        this.title = title;
    }

    public String toString(){
        return String.format("%s %s: %s %s\n",super.toString(),"author", getAuthor(),"title ", getTitle());
    }

    public String getAuthor() {return author;}
    public String getTitle() {return title;}

}
