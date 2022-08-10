interface Drawable
{
	void draw();
}
class Rect implements Drawable
{
public void draw()
{
	System.out.println("Draw a Ractangle");
}
}
class Circle implements Drawable
{
	public void draw()
    {
    System.out.println("Draw a circle");
    }
}
/**abstract class x
{
    abstract void ray();
}
class T extends x
{
    void ray(); 
    {
    System.out.println("Truck");
    }
}**/
class Main
{
public static void main(String args[])
{
Rect obj=new Rect();
obj.draw();
Circle obj2=new Circle();
obj2.draw();
////T obj3=new T();
//obj3.ray();
}
}