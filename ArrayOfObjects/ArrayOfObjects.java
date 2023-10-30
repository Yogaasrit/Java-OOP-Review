class Student{
  String name;
  int rollNo;
  String dept;

  public void printStudentDetails(Student students[]){
    for(Student candidate : students)
    {
      System.out.println(candidate.name + " " + candidate.rollNo+" "+candidate.dept);
    }
  }
  public Student(String name, int rollNo, String dept)
  {
      this.name = name;
      this.rollNo = rollNo;
      this.dept = dept;
  }
  public Student(){
    
  }
}


class Main{
  public static void main(String[] args)
  {
    Student student1 =  new Student("Alexa",01,"CSE");
    // student1.name = "Alexa";
    // student1.rollNo = 01;
    // student1.dept = "CSE";

    Student student2 =  new Student("Bug",02,"EEE");
    // student2.name = "Bug";
    // student2.rollNo = 02;
    // student2.dept = "EEE";

    Student student3 =  new Student("Cookie",03,"ECE");
    // student3.name = "cookie";
    // student3.rollNo = 03;
    // student3.dept = " ECE";

    Student students[] = new Student[3];
    students[0] = student1;
    students[1] = student2;
    students[2] = student3;

    Student obj = new Student();
    obj.printStudentDetails(students);
  }
}