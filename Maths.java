//Method over loading
class MyMaths
{
    public void squar()
    {
        System.out.println(2*2);
    }
    int get(int n,int e)
    {
    return n*e;
     }
     double gat(double s)
     {
        return s*s;
     }
}
     public class Maths
     {
        public static void main(String srgs[])
        {
            MyMaths p=new MyMaths();
            p.squar();
            int a1=p.get(3,4);
            double a2=p.gat(3.2);
            System.out.println(a1);
            System.out.println(a2);
        }
     }
