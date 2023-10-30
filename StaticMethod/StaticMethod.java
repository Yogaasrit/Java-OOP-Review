package StaticMethod;

class Student{
  String name;
  int rollNo;
  String dept;
  static String college = "KRCE";
  //Non static method
  public void printDetails(){
     System.out.println(name + " "+ rollNo + " "+ dept+" "+college);
  }
  // Static method
  public static void printStudentDetails(Student student){
    // System.out.println(name + " "+ rollNo + " "+ dept+" "+college);Error
    // Non static variable cannot be used in static method directly when called like Student.printStudentDetails();
    // Indirectly we can access by passing the reference of object Student.printStudentDetails(student1);
    // Getting as parameter printStudentDetails(Student student1)
    System.out.println(student.name + " "+ student.rollNo + " "+ student.dept+" "+college);
  }
}

public class StaticMethod 
{
  public static void main(String[] args)
  {
    Student student1 =  new Student();
    student1.name = "Alexa";
    student1.rollNo = 01;
    student1.dept = "CSE";
    student1.printDetails();

    Student student2 =  new Student();
    student2.name = "Bug";
    student2.rollNo = 02;
    student2.dept = "EEE";
    student2.printDetails();

    // Student.printStudentDetails();
    Student.printStudentDetails(student1);
  }
}
