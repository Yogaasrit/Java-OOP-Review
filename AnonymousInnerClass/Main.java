package AnonymousInnerClass;
class A
{
  public void display(){
    System.out.println("Display");
  }
}
public class Main {
  public static void main(String[] args)
  {
    A obj = new A()
    //Inner class
    {
      public void display()
      {
        System.out.println("Display updated");
      }
    };
    obj.display();
  }
}

// Overriding the method without new class by extending.
// Directly while creating objects.
// This is called AnonymousInnerClass.