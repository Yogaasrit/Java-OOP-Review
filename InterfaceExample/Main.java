package InterfaceExample;
import java.util.Scanner;

abstract class Processor {
  int data;
  public int showData() {
    return this.data;
  }
  public abstract void process(int data);
}

class Factorial extends Processor {
  public void process(int data) {
    int fact = 1;
    for(int i=1;i<=data;i++){
      fact = fact * i;
    }
    System.out.println("Factorial : "+ fact);
  }
}

class Circle extends Processor {
  public void process(int data) {
    System.out.println("Area of circle "+ 3.14*data*data);
  }
}

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String option  = sc.nextLine();
    int data = sc.nextInt();
    if(option.equals("circle")){
      Circle obj = new Circle();
      obj.process(data);
    }
    else{
      Factorial obj = new Factorial();
      obj.process(data);
    }
    sc.close();
  }
}
