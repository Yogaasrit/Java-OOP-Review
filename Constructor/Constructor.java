// Constructor is used to create a instance of a object.
// Onload it will be called.
// Things to perform onload can be done using constructor.
// ex. Db connectivity.
// Method with no return 

package Constructor;
class Vote{
  String name;
  int age;
  Vote(String name,int age)
  {
    this.name = name;
    this.age = age;
    System.out.println(this.checkEligible());
  }
  public String checkEligible()
  {
    if(this.age >= 18)
      return "Eligible";
    return "Not Eligible";
  }
}

public class Constructor {
  public static void main(String[] args)
  {
    Vote person1 = new Vote("Alexa",18);
    Vote person2 = new Vote("Bug",19); 
    Vote person3 = new Vote("Cache",11);
  }
}
