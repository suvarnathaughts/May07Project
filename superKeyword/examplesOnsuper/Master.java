package examplesOnsuper;


abstract class X
{   
    int a= 20;
    public abstract void m1();
    public abstract void m2();
    public void m3()
    {
      System.out.println(a);
    }
}
class Y extends X
{
   public void m1()
   {
     System.out.println("implimentation of m1 method of class A");
   }
    public void m2()
   {
     System.out.println("implimentation of m2 method of class A");
   }
   
}
public class Master
{
   public static void main(String args[])
    {
    Y obj = new Y();
    obj.m1();
    obj.m2();
    obj.m3();
   }


}
