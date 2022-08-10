import java.util.ArrayList;

    public class JF
    {
        public static void main(String args [])
        {
            try{
            ArrayList<String> Ara=new ArrayList<String>();
            Ara.add("Car");
            Ara.add("Drive");
            Ara.add("Fast");
          for(int i=0;i<Ara.size();i++)
          {
            System.out.println(Ara.remove(4));
          }
          }catch(Exception e)
            {
                 System.out.println("Error");
            }
        }
    }
