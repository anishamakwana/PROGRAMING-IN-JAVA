interface Animal
{
    void sound();
}

interface Dog extends Animal
{
    void eat();
}

class Test implements Dog
{
    public void sound()
    {
        System.out.println("Dog barks");
    }

    public void eat()
    {
        System.out.println("Dog eats food");
    }

    public static void main(String args[])
    {
        Test t = new Test();
        t.sound();
        t.eat();
    }
}
