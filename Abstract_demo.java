public class Abstract_demo 
{
    public static void main(String[] args)
    {
        B b1=new B();
        b1.area(12,4);
        b1.area(7);
    }
}

abstract class A
{
     abstract void area();
}

class B extends A
{
    void area(int x,int y)
    {
        System.out.println("Arae rectangle: "+(x*y));   
    }
    void area(int r)
    {
        System.out.print("Arae circle : "+(r*r*3.14));
    }
}
