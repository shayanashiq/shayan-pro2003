 class Animal
{
    public void Animalsound()
    {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal
{
    public void Animalsound()
    {
        System.out.println("Dog says :Bhao");
    }
}
class Cat extends Animal
{
    public void Animalsound()
    { 
    System.out.println("Cat says :Meao");
    }
}
class Kap
{
    public static void main(String args[])
    {
        Animal A=new Animal();
        A.Animalsound();
        Animal D=new Dog();
        D.Animalsound();
        Animal C=new Cat();
        C.Animalsound();
    }
}