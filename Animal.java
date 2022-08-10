// GET & SET AND ENUM(special class)
class AM
{
    private String n,c;
   private int e;
   public String getnam()
    {
        return n;
    }
    public void setnam(String k)
    {
        this.n=k;
    }
    public String getcol()
    {
        return c;
    }
    public void setcol(String w)
    {
        this.c=w;
    }
    public int getlk()
    {
        return e;
    }
    public void setlk(int q)
    {
        this.e=q;
    }
}
public class Animal
{
    enum LV
{
    Name,
    Age,
    color;
}
    public static void main(String args[])
    {
        AM D=new AM();
        D.setnam("Shayan");
        D.setcol("Skin");
        D.setlk(19);
       // System.out.println(D.getnam());
        LV g=LV.Name;
        LV r=LV.color;
        LV u=LV.Age;
        System.out.println(g+"="+D.getnam());
        System.out.println(r+"="+D.getcol());
        System.out.println(u+"="+D.getlk());
    }
}