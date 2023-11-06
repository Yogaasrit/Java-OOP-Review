package InterfaceDemo;
interface Computer
{
  public void code();
}
class Laptop implements Computer
{
  public void code(){
    System.out.println("Code using Laptop");
  }
}
class Desktop implements Computer
{
  public void code(){
    System.out.println("Code using Desktop");
  }
}
class Developer
{
  public void code(Computer com)
  {
    com.code();
  }
}
public class Main {
  public static void main(String[] args)
  {
    Laptop lap = new Laptop();
    Desktop desk = new Desktop();

    Computer com = new Desktop();
    Developer yoga = new Developer();
    yoga.code(com);
  }
  
}
