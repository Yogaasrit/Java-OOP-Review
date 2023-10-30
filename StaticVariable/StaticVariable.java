package StaticVariable;
// Static variable are class oriented.
// Not object based.
class Student{
  String name;
  int rollNo;
  String dept;
  static String college = "KRCE";
  //This belongs to the class not to object.
  static String skill;

  public void printDetails()
  {
     System.out.println(name + " "+ rollNo + " "+ dept+" "+college+" "+skill);
  }
}

class Main {
  public static void main(String[] args)
  {
    Student student1 =  new Student();
    student1.name = "Alexa";
    student1.rollNo = 01;
    student1.dept = "CSE";
    Student.skill = "Java";

    student1.printDetails();

    Student student2 =  new Student();
    student2.name = "Bug";
    student2.rollNo = 02;
    student2.dept = "EEE";
    Student.skill = "C";

    student2.printDetails();

    Student student3 =  new Student();
    student3.name = "cookie";
    student3.rollNo = 03;
    student3.dept = " ECE";
    Student.skill = "Python";

    student3.printDetails();

    System.out.println("After Changing Static Value");
    Student.skill = "JavaScript";
    student1.printDetails();
    student2.printDetails();
    student3.printDetails();
  }
}
