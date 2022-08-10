abstract class Vehicle
{
    int no_of_wheels;
    String color;
    double fuel;
    double speed;
    abstract void start();
    abstract  void accelerate();
    abstract  void brake();
}
abstract class TransportationVehicle extends Vehicle
{
    int no_of_Doors;
    double loadCapacity;
}
class Van extends TransportationVehicle
{
    int no_of_boxes;
    void loadVan()
    {
        System.out.println("Loading Van");
    }
    void start()
    {
        System.out.println("Start the van");
    }
    void accelerate()
    {
        System.out.println("Acceleration");
    }
    void brake()
    {
        System.out.println("Brakeof Van");
    }
}
class Truck extends TransportationVehicle
{
    double size_of_containers;
    void loadcontainer()
    {
        System.out.println("Load the container");
    }
    void start()
    {
        System.out.println("Start the truck");
    }
    void accelerate()
    {
        System.out.println("Accelerate truck");
    }
    void brake()
    {
        System.out.println("Braek of truck");
    }
}
abstract class PassengerVehicle extends TransportationVehicle
{
    int Passengerseats;
}
class Car extends PassengerVehicle
{
    int no_of_Doors;
}
class Bike extends PassengerVehicle
{
    int saddleHeight;
}
public class All
{
    public static void main(String args [])
    {
        Vehicle o1=new Vehicle();
        TransportationVehicle o2=new TransportationVehicle();
        Van o3=new Van();
        Truck o4=new Truck();
        PassengerVehicle o5=new PassengerVehicle();
        Car o6=new Car();
        Bike o7=new Bike();
        o1.start();
        o1.accelerate();
        o1.brake();
       // o3.start();
        //o3.accelerate();
       // o3.brake();
        o3.loadVan();
        o4.loadcontainer();
       // o4.start();
       // o4.accelerate();
        //o4.brake();
    }
}