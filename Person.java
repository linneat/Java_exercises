public class Person {
  
  String firstName;
  String lastName;
  int age;


  public Person(String firstName, String lastName, int age)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String fullName()
  {
    String fullName = firstName + " " + lastName.toUpperCase();
    return fullName;
  }
}