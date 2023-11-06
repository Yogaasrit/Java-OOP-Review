public class Main {
  public static void main(String[] args) {
    int num1 = 10; // Primitive varibale
    Integer num2 = new Integer(9);// Wrapper class reference variable - Boxing
    Integer num3 = num1; //Auto-boxing Assigning the primitive value to reference variable.

    int num4 = num2.intValue(); // UnBoxing Assigning the reference variable to primitive value.
    int num5 = num2; // AutoBoxing

    System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5);
  }
}
