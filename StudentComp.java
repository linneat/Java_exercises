public class StudentComp {
  
  String uniName;
  String studentNr;
  Person person;


  public StudentComp(String uniName, String studentNr, String firstName, String lastName, int age)
  {
    this.person = new Person(firstName, lastName, age);
    this.uniName = uniName;
    this.studentNr = studentNr;
  }


  public StudentComp(String uniName, String studentNr, Person person)
  {
    this.person = person;
    this.uniName = uniName;
    this.studentNr = studentNr;
  }

   public String fullName()
  {
    return person.fullName();
  }

}