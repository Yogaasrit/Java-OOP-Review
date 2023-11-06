package Casting;
class A{
  public void show(){
    System.out.println("In A class");
  }
}
class B extends A{
  public void print(){
    System.out.println("In B class");
  }
}
public class Main {
  public static void main(String[] args)
  {
    B obj = new B();
    obj.show();
    obj.print();
    A obj1 = new B();
    obj1.show();
    // obj1.print();Error
    A obj2 = (A) new B(); //Upcasting(Explicit)
    obj2.show();
    // obj2.print();Error
    B obj3 = (B) new A(); // Downcasting(implicit)
    obj3.show();
    obj3.print();
  }
}
