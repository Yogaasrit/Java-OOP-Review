package AbstractAnonymousInnerClass;

abstract class A{
  public abstract void printRandom();
}
public class Main {
  public static void main(String[] args)
  {
    A obj = new A() {
      public void printRandom()
      {
        System.out.println("Printing Random...");
      }
    };
    obj.printRandom();
  }
}
// Instead of creating the new class to implement abstract methods,
// we can use AnonymousInner class.
// so that separate class need not be created.
