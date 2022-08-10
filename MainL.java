class A {
    //int bl=6;
    public void loop () {
        for(int i=1;i<=9;i=i+2)
            {
                for(int j=1;j<=6;j++)
                {
                    System.out.print("/t");
                }
                for(int x=1;x<=i;x=x+1)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
               // bl++;
            }
    }
}

public class MainL
{
    public static void main (String args[])
    {
       A obj=new A();
       obj.loop();
    }
}