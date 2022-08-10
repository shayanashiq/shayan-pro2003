// using Array ,  Exception , Scaneer (for input)
import java.util.Scanner;
public class  Arra
{
    public static void main(String args[])
    {
        try{
            String[] u={"Burger","pizza","Coke"};
       Scanner Sc=new Scanner(System.in);
            System.out.println("Enter the code");
            int d=Sc.nextInt();
            System.out.println(u[d]);
        }catch(Exception e){
            String r="This is the error";
            System.out.println(r);
        }
    }
}