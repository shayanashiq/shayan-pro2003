//Get & set Method
class ThrowM
{
    private int id;
    private String Name;
    public String getName()
    {
        return Name;
    }
    public void setName(String MyName)
    {
        this.Name=MyName;
    }
    public int getid()
    {
        return id;
    } 
    public void setid(int i)
    {
        this.id=i;
    }
}
public class Throw
{
    public static void main(String args[])
    {
        ThrowM imp=new ThrowM();
        imp.setName("shayan");
        System.out.println(imp.getName());
        imp.setid(116);
        System.out.println(imp.getid());
    }
}









