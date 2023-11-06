package InnerClass;
class A{
  int value = 10;
  public void random(){
    System.out.println("Random.");
  }
  class B{
    public void print(){
      System.out.println("Print");
    }
  }
}
public class Main {
  public static void main(String[] args)
  {
    A obj = new A();
    obj.random();
    System.out.println(obj.value);

    A.B obj1 = obj.new B();
    obj1.print();

  }
}
