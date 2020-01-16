public class Student extends Person {
  
  String uniName;
  String studentNr;


  public Student(String uniName, String studentNr, String firstName, String lastName, int age)
  {
    super(firstName, lastName, age);
    this.uniName = uniName;
    this.studentNr = studentNr;
  }

   public String fullName()
  {
    String fullName = firstName + " " + lastName.toUpperCase();
    return fullName;
  }

}