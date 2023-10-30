package Encapsulation;
class Employee {
  private int empID;
  private int empSalary;

  public int getEmpID() {
    return empID;
  }
  public void setEmpID(int empID) {
    this.empID = empID;
  }
  public int getEmpSalary() {
    return empSalary;
  }
  public void setEmpSalary(int empSalary) {
    this.empSalary = empSalary;
  }
}
class Main 
{
  public static void main(String[] args) {
    Employee obj =  new Employee();
    obj.setEmpID(1678);
    obj.setEmpSalary(50000);
    System.out.println("Employee Id: "+obj.getEmpID());
    System.out.println("Employee Salary: "+obj.getEmpSalary());
  }
}
