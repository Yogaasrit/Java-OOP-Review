package SuperAndThis;
class A{
  A(){
    System.out.println("In A's Constructor");
  }
  A(int data){
    System.out.println(data);
  }
}
class B extends A{
  B(){
    super();
    System.out.println("In B's Constructor");
  }
  B(int data){
    this();
    System.out.println(data);
  }
}
public class Main {
  public static void main(String[] args){
    // new B();//Anonymous object
    // It creates a object but it cant be reused because it has no reference variable.
    new B(10);
  }
}
// constructor always calls the super() class constructor.
// super() can't need to be called explicitly.
