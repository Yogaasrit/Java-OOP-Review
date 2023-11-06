package Abstract;

abstract class Car {
  public static void drive() {
    System.out.println("Driving");
  }
  public void turn(){
    System.out.println("Turning");
  }
  public abstract void playMusic();
}

class BMW extends Car {

  public void playMusic() {
    System.out.println("Music");
  }
}

public class Main {
  public static void main(String[] args) {
  Car obj = new BMW();
  Car.drive();
  obj.playMusic();

  }
}

// Abstract methods should be placed in abstract class.
// Abstract classes can have static method, method, abstract method.
// No compelsion that Abstract class must have abstract methods.
// Object cant be created for abstract class.
// The class that inherit abstract class must override the unimplemented methods.
// If it fails to implement all abstract method then that class should also be abstract.

