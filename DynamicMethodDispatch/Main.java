package DynamicMethodDispatch;
class A{
  public void show(){
    System.out.println("In A");
  }
}
class B extends A{
  public void show(){
    System.out.println("In B");
  }
}
class C extends A{
  public void show(){
    System.out.println("In C");
  }
}
public class Main {
  public static void main(String[] args)
  {
    A obj = new A();
    obj.show();
    obj = new B();
    obj.show();
    obj = new C();
    obj.show();

    // Behaving differently with different objects - polymorphism. 
    // RunTime polymorphism.
    // Irrespective of type of reference variable, it depends only on the object. 
    // Possible only in inheritance.

  }
}
