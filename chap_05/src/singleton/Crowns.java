package singleton;

public class Crowns {
    private long hellers;
    private static final int HELLERS_PER_CROWN = 100;

    //Constructors
    public Crowns(double amount){
        this.hellers = Math.round(amount * HELLERS_PER_CROWN);
    }

    public Crowns(Crowns crowns){
        hellers = crowns.getHellers();
    }

    //Methods
    public long getCrowns(){
        return getHellers() / HELLERS_PER_CROWN;
    }

    public long getHellers(){
        return hellers;
    }

    public long getLeftHellers(){
        return getHellers() % HELLERS_PER_CROWN;
    }

    public String toString()
    {
        if(getCrowns() < 0)
        {
            return "Crowns: " + getCrowns() + "," + -1*getLeftHellers() + " CZK";
        }
        else if(getLeftHellers() < 0)
        {
            return "Crowns: " +  "-" + getCrowns() + "," + -1*getLeftHellers() + " CZK";
        }
        else {
            return "Crowns: " +  getCrowns() + "," + getLeftHellers() + " CZK";
        }
    }

    public void print()
    {
        System.out.println(toString());
    }

    public boolean isZero()
    {
        return getHellers() == 0;
    }

    public Crowns plus(Crowns amount)
    {
        return new Crowns(1.0 * (this.getHellers() + amount.getHellers()) / HELLERS_PER_CROWN);
    }

    public Crowns minus(Crowns amount)
    {
        return new Crowns((double) (this.getHellers() - amount.getHellers()) / HELLERS_PER_CROWN);
    }
}
